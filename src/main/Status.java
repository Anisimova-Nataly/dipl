package main;

public class Status {
	boolean planing = false;
	boolean callJornal =false;
	boolean ambJornal = false;
	boolean manipJornal = false;
	boolean statist = false;
	boolean cards = false;
	boolean main = true;
	boolean isNew = true;
	
	
	public boolean isNew() {
		return isNew;
	}
	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}
	public boolean isMain() {
		return main;
	}
	public void setMain(boolean main) {
		this.main = main;
	}
	public boolean isPlaning() {
		return planing;
	}
	public void setPlaning(boolean planing) {
		this.planing = planing;
	}
	public boolean isCallJornal() {
		return callJornal;
	}
	public void setCallJornal(boolean callJornal) {
		this.callJornal = callJornal;
	}
	public boolean isAmbJornal() {
		return ambJornal;
	}
	public void setAmbJornal(boolean ambJornal) {
		this.ambJornal = ambJornal;
	}
	public boolean isManipJornal() {
		return manipJornal;
	}
	public void setManipJornal(boolean manipJornal) {
		this.manipJornal = manipJornal;
	}
	public boolean isStatist() {
		return statist;
	}
	public void setStatist(boolean statist) {
		this.statist = statist;
	}
	public boolean isCards() {
		return cards;
	}
	public void setCards(boolean cards) {
		this.cards = cards;
	}
	
	

}
