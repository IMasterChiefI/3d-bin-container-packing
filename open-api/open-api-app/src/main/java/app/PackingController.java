package com.github.skjolber.packing;

import com.github.skjolber.packing.openapi.server.api.PackingApi;
import com.github.skjolber.packing.openapi.model.PackingRequest;
import com.github.skjolber.packing.openapi.model.PackingResponse;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PackingController implements PackingApi {

    @Override
    public PackingResponse packingPost(PackingRequest request) {
        // TODO: Hier deine Logik aufrufen!
        PackingResponse response = new PackingResponse();
        response.setMessage("API läuft! Anfrage erhalten mit " + request.getItems().size() + " Items.");
        return response;
    }
}
