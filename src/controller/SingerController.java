package controller;

import model.Singer;
import service.ISingerService;
import service.SingerServiceIMPL;


import java.util.List;

public class SingerController {

    private final ISingerService singerService = (ISingerService) new SingerServiceIMPL();

    public List<Singer> getSingers() {
        return singerService.findAll();
    }

    public void addSinger(Singer singer) {
        singerService.save(singer);
    }

    public void deleteSinger(int id) {
        singerService.deleteById(id);
    }

    public Singer findSingerById(int id) {
        return singerService.findById(id);
    }

    public void sortSingerList() {
        singerService.sort();
    }

}