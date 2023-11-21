package springapi.services;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springapi.entities.Note;
import springapi.repositories.NoteRepository;

import java.util.List;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepo;

    //create
    public Note save(Note note) {
        return noteRepo.save(note);
    }

    //read
    public Note findById(String  id) {
        return noteRepo.findById(id);
    }

    public List<Note> findAll() {
        return noteRepo.findAll();
    }

    //update
    public String update(String id, Note note) {
        return noteRepo.update(id, note);
    }


    //delete
    public String delete(String id) {
       return noteRepo.delete(id);
    }

}
