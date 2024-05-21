package it.epicode.esercizioDay86.controller;

import it.epicode.esercizioDay86.models.Post;
import it.epicode.esercizioDay86.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

//  primo passo: collegare al service
    @Autowired
    private PostService postService;

//nei contesti reali si usa la responseEntity
    @GetMapping("/")
    public ResponseEntity<List<Post>> getPosts(){
        //una ResponseEntity è un entità che come risposta (personalizzata) ci torna <List><Post>>
        //in questo caso la usiamo per ottenere tutti i post e un codice di risposta 200
        return new ResponseEntity<>(postService.getAllPosts(), HttpStatusCode.valueOf(200));

//        BTW, per avere lo status "ok" si può anche usare il seguente metodo:
//        return new ResponseEntity<>(postService.getAllPosts(), HttpStatus.OK);

    }

}
