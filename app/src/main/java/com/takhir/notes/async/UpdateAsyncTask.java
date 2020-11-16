package com.takhir.notes.async;

import android.os.AsyncTask;
import com.takhir.notes.models.Note;
import com.takhir.notes.persistence.NoteDao;

public class UpdateAsyncTask extends AsyncTask<Note, Void, Void> {
    private NoteDao mNoteDao;

    public UpdateAsyncTask(NoteDao dao) {
        this.mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDao.updateNotes(notes);
        return null;
    }
}
