package com.takhir.notes.async;

import android.os.AsyncTask;
import com.takhir.notes.models.Note;
import com.takhir.notes.persistence.NoteDao;

public class InsertAsyncTask extends AsyncTask<Note, Void, Void> {
    private NoteDao mNoteDao;

    public InsertAsyncTask(NoteDao dao) {
        this.mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDao.insertNotes(notes);
        return null;
    }
}
