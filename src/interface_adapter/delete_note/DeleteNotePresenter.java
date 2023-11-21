package interface_adapter.delete_note;

import interface_adapter.NoteViewModel;
import interface_adapter.ViewManagerModel;
import use_case.NoteOutputData;
import use_case.delete_note.DeleteNoteOutputBoundary;

public class DeleteNotePresenter implements DeleteNoteOutputBoundary {
    private final NoteViewModel noteViewModel;
    private final ViewManagerModel viewManagerModel;

    public DeleteNotePresenter(NoteViewModel noteViewModel, ViewManagerModel viewManagerModel){
        this.noteViewModel = noteViewModel;
        this.viewManagerModel = viewManagerModel;
    }

    @Override
    public void prepareDeleteNoteSuccessView(NoteOutputData noteOutputData) {

    }

    @Override
    public void prepareDeleteNoteFailView(String error) {

    }
}
