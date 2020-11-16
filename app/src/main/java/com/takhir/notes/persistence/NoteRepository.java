package com.takhir.notes.persistence;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.takhir.notes.async.DeleteAsyncTask;
import com.takhir.notes.async.InsertAsyncTask;
import com.takhir.notes.async.UpdateAsyncTask;
import com.takhir.notes.models.Note;

import java.util.List;

public class NoteRepository {
    private NoteDatabase mNoteDatabase;

    public NoteRepository(Context context) {
        mNoteDatabase = NoteDatabase.getInstance(context);
    }

    public void insertNoteTask(Note note) {
        new InsertAsyncTask(mNoteDatabase.getNoteDao()).execute(note);
    }

    public LiveData<List<Note>> retrieveNoteTasks() {
        return mNoteDatabase.getNoteDao().getNotes();
    }

    public void deleteNoteTask(Note note) {
        new DeleteAsyncTask(mNoteDatabase.getNoteDao()).execute(note);
    }

    public void updateNoteTask(Note note) {
        new UpdateAsyncTask(mNoteDatabase.getNoteDao()).execute(note);
    }
}
