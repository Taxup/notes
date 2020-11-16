package com.takhir.notes.persistence;

import androidx.lifecycle.LiveData;
import androidx.room.*;
import com.takhir.notes.models.Note;

import java.util.List;

@Dao
public interface NoteDao {

    @Insert
    long[] insertNotes(Note... notes);

    @Query("select * from notes")
    LiveData<List<Note>> getNotes();

    @Delete
    int deleteNotes(Note... notes);

    @Update
    int updateNotes(Note... notes);
}
