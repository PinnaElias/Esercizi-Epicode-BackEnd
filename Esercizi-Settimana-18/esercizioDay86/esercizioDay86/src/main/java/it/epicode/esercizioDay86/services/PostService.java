package it.epicode.esercizioDay86.services;

import it.epicode.esercizioDay86.exceptions.NotFoundException;
import it.epicode.esercizioDay86.models.Autore;
import it.epicode.esercizioDay86.models.CreatePostRequestBody;
import it.epicode.esercizioDay86.models.EditPostRequestBody;
import it.epicode.esercizioDay86.models.Post;
import it.epicode.esercizioDay86.repositories.AutoreRepository;
import it.epicode.esercizioDay86.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepo;

    @Autowired
    private AutoreRepository autoreRepo;

    //si fa sempre così
    public Page<Post> getAllPosts(int page, int size, String sortBy){

        //mi sto creando un effetiva pagina con le caratteristiche del costruttore
        //passandogli il numero di pagine che voglio, le dimensioni, e in quale modo esse vanno ordinate
        //si fa sempre così
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return postRepo.findAll(pageable);
        //.findAll ritorna una lista di risultati, ma se gli passi un pageable
        // ti ritorna in automatico una lista di pagine corrispondente al numero specificato in ingresso
    }

    public Post getPostById(UUID id){
//          potrei fare
//        Post postToFind = postRepo.findById(id).orElse(null);
//          oppure...
        return postRepo.findById(id).orElseThrow(() ->
                new NotFoundException("Post non trovato con id: " + id));
    }

    public String generateNewPost(CreatePostRequestBody postRequestBody){

        //richiama
        Autore autoreToFind = autoreRepo.findById(postRequestBody.getAutoreId()).orElseThrow(() ->
                new NotFoundException("Autore con id: " + postRequestBody.getAutoreId() + "non trovato"));

        Post postToAdd = new Post();
        postToAdd.setTitolo(postRequestBody.getTitolo());
        postToAdd.setContenuto(postRequestBody.getContenuto());
        postToAdd.setCover("https://picsum.photos/200/300");
        postToAdd.setCategoria(postRequestBody.getCategoria());
        postToAdd.setTempoDiLettura(postRequestBody.getTempoDiLettura());
        postToAdd.setAutore(autoreToFind);

        postRepo.save(postToAdd);
        //in teoria dovrei usare postToAdd.ToString, tuttavia stai già tornando una stringa...
        return "post creato con successo!\n" + postToAdd;
        //  " \n " dentro una stringa permette di andare a capo in quel punto


    }

}


//    private List<Post> posts = new ArrayList<>();
//
////    getAll
//    public List<Post> getAllPosts(){
//        return this.posts;
//    }
//
//    public Post getPostById(int id){
//
////      streammi la lista di post e filtra quello con l'id' che gli abbiamo passato
////      findFirst è semplicemente un metodo comodo per farsi tornare qualcosa con l'id specificato
//        return this.posts.stream().filter(post -> post.getId() == id).findFirst().orElse(null);
//    }
//
//    public Post addPost(CreatePostRequestBody postRequestBody) {
//
////      si va a prendere tutti i metodi di CreatePostRequestBody per creare un nuovo post
//        Post newPost = new Post(postRequestBody.getCategoria(), postRequestBody.getTitolo(),
//                postRequestBody.getCover(), postRequestBody.getContenuto(), postRequestBody.getTempoDiLettura());
//
////      clasici metodi per salvarsi l'oggetto creato'
//        posts.add(newPost);
//        return newPost;
//    }
//
//    public Post updatePost(EditPostRequestBody postRequestBody, int id){
//
////  esistono diversi metodi per gestirsi questa cosa
//    Post postDaAggiornare = this.posts.stream().filter(post -> post.getId() == id)
//                            .findFirst().orElse(null);
//
//    postDaAggiornare.setCategoria(postRequestBody.getCategoria());
//    postDaAggiornare.setContenuto(postRequestBody.getContenuto());
//    postDaAggiornare.setContenuto(postRequestBody.getContenuto());
//    postDaAggiornare.setTitolo(postRequestBody.getTitolo());
//    postDaAggiornare.setCover(postRequestBody.getCover());
//    return postDaAggiornare;
//    }
//
//    public void deletePost(int id){
//        Post postDaEliminare = this.posts.stream().filter(post -> post.getId() == id)
//                                .findFirst().orElse(null);
//        this.posts.remove(postDaEliminare);
//    }