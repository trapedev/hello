package kobe_u.cs.daikibo.tsubuyaki.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kobe_u.cs.daikibo.tsubuyaki.entity.Tsubuyaki;
import kobe_u.cs.daikibo.tsubuyaki.repository.TsubuyakiRepository;

@Service
public class TsubuyakiService {
    @Autowired
    TsubuyakiRepository repo;

    public Tsubuyaki postTsubuyaki(Tsubuyaki t) {
        String name = t.getName();
        if (name == null || name.length()==0) {
            t.setName("名無しさん");
        }
        t.setCreatedAt(new Date());
        return repo.save(t);
    }

    public List<Tsubuyaki> getAllTsubuyaki() {
        Iterable<Tsubuyaki> found = repo.findAll();
        ArrayList<Tsubuyaki> list = new ArrayList<>();
        found.forEach(list::add);
        return list;
    }
}
