package it.epicode.esercizioDay86.services;

import it.epicode.esercizioDay86.models.CreatePostRequestBody;
import it.epicode.esercizioDay86.models.EditPostRequestBody;
import it.epicode.esercizioDay86.models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    private List<Post> posts = new ArrayList<>();

//    getAll
    public List<Post> getAllPosts(){
        return this.posts;
    }

    public Post getPostById(int id){

//      streammami la lista di post e filtra quello con l'id' che gli dobbiam passare
//      findFirst è semplicemente un metodo comodo per farsi tornare qualcosa con l'id specificato
        return this.posts.stream().filter(post -> post.getId() == id).findFirst().orElse(null);
    }

    public Post addPost(CreatePostRequestBody postRequestBody) {

//      si va a prendere tutti i metodi di CreatePostRequestBody per creare un nuovo post
        Post newPost = new Post(postRequestBody.getCategoria(), postRequestBody.getTitolo(),
                postRequestBody.getCover(), postRequestBody.getContenuto(), postRequestBody.getTempoDiLettura());

//      clasici metodi per salvarsi l'oggetto creato'
        posts.add(newPost);
        return newPost;
    }

    public Post updatePost(EditPostRequestBody postRequestBody, int id){

//  esistono diversi metodi per gestirsi questa cosa
    Post postDaAggiornare = this.posts.stream().filter(post -> post.getId() == id)
                            .findFirst().orElse(null);

    postDaAggiornare.setCategoria(postRequestBody.getCategoria());
    postDaAggiornare.setContenuto(postRequestBody.getContenuto());
    postDaAggiornare.setContenuto(postRequestBody.getContenuto());
    postDaAggiornare.setTitolo(postRequestBody.getTitolo());
    postDaAggiornare.setCover(postRequestBody.getCover());
    return postDaAggiornare;
    }

    public void deletePost(int id){
        Post postDaEliminare = this.posts.stream().filter(post -> post.getId() == id)
                                .findFirst().orElse(null);
        this.posts.remove(postDaEliminare);
    }

}
