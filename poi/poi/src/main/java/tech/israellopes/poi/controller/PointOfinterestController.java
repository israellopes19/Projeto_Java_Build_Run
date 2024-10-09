package tech.israellopes.poi.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tech.israellopes.poi.controller.dto.CreatePointOfinterest;
import tech.israellopes.poi.entity.PointOfininterest;
import tech.israellopes.poi.repository.PointofinterestRepository;

@RestController
public class PointOfinterestController {

    private final PointofinterestRepository repository;

    public PointOfinterestController(PointofinterestRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/points-of-interests")
    public ResponseEntity<Void> createPoi(@RequestBody CreatePointOfinterest body){

        repository.save(new PointOfininterest(body.name(), body.x(), body.y()));

    return ResponseEntity.ok().build();

   }
}
