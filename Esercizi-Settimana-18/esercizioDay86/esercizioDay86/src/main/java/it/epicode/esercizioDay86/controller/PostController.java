package it.epicode.esercizioDay86.controller;

import it.epicode.esercizioDay86.models.CreatePostRequestBody;
import it.epicode.esercizioDay86.models.Post;
import it.epicode.esercizioDay86.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    //  primo passo: collegare al service
    @Autowired
    private PostService postService;

    //nei contesti reali si usa la responseEntity
    @GetMapping("/") //mappa il metodo HTTP, in questo caso GET
    public ResponseEntity<List<Post>> getPosts() {
        //una ResponseEntity è un entità che come risposta (personalizzata) ci torna <List><Post>>
        //in questo caso la usiamo per ottenere tutti i post e un codice di risposta 200
        return new ResponseEntity<>(postService.getAllPosts(), HttpStatusCode.valueOf(200));
//       BTW, per avere lo status "ok" si può anche usare il seguente metodo:
//       return new ResponseEntity<>(postService.getAllPosts(), HttpStatus.OK);
    }

//  a differenza di prima ci facciamo tornare un JSON con un singolo post
    @GetMapping("/{id}")
    public ResponseEntity<Post> getSinglePost(@PathVariable int id) {
        Post post = postService.getPostById(id);
        if (post == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(post, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Post> createSinglePost(@RequestBody CreatePostRequestBody newPost) {
        return new ResponseEntity<>(postService.addPost(newPost), HttpStatusCode.valueOf(201));

//        BTW, per avere lo status "CREATED" si può anche usare il seguente metodo:
//        return new ResponseEntity<>(postService.getAllPosts(), HttpStatus.CREATED);
    }


}
