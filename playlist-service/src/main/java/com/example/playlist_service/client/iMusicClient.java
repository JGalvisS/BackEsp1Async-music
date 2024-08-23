package com.example.playlist_service.client;

import com.example.playlist_service.model.Music;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "music-service")
public interface iMusicClient {

    @GetMapping("/{genre}")
    ResponseEntity<List<Music>> getMusicaByGenre(@PathVariable String genre);
}
