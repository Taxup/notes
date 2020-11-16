package com.takhir.notes.async;

import android.os.AsyncTask;
import com.takhir.notes.models.Note;
import com.takhir.notes.persistence.NoteDao;

public class DeleteAsyncTask extends AsyncTask<Note, Void, Void> {
    private NoteDao mNoteDao;

    public DeleteAsyncTask(NoteDao dao) {
        this.mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDao.deleteNotes(notes);
        return null;
    }
}
