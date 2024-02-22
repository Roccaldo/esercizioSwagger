package co.develhope.esercizioSwagger.controllers;

import co.develhope.esercizioSwagger.services.ReturnNameService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class Controller {
    @Autowired
    ReturnNameService returnNameService;

    @GetMapping("/name")
    @Operation(summary = "Get a Name by providing a name", description = "This endpoint retrieves the name based on the provided input.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Return the name"),
            @ApiResponse(responseCode = "400", description = "Name is null")
    })
    public String getName(@RequestParam String name) {
        return returnNameService.getName(name);
    }

    @PostMapping("/invertname")
    @Operation(summary = "Invert Name", description = "This endpoint inverts the provided name.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Return inverted name"),
            @ApiResponse(responseCode = "400", description = "Name is null")
    })

    public StringBuilder invertName(@RequestParam String name) {
        return returnNameService.invertName(name);
    }
}
