package com.example.playlist_service.controller;

import com.example.playlist_service.client.iMusicClient;
import com.example.playlist_service.model.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlaylistController {
    @Autowired
    private iMusicClient IMusicClient;

    @GetMapping("playlist/{genre}")
    public ResponseEntity <List<Music>> getPlayListByGenre(@PathVariable String genre){
        return IMusicClient.getMusicaByGenre(genre);
    }
}
