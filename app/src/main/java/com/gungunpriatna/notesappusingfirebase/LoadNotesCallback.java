package com.gungunpriatna.notesappusingfirebase;

import com.gungunpriatna.notesappusingfirebase.entity.Note;

import java.util.ArrayList;

public interface LoadNotesCallback {
    void preExecute();
    void postExecute(ArrayList<Note> notes);

}
