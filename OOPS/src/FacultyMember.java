public class FacultyMember extends LibraryMember {

	private int facultyID;

	public FacultyMember(int facultyID) {
		this.facultyID = facultyID;
	}

	@Override
	public void borrowItem(Libraryitem item) {
		System.out.println("Faculty ID : " + facultyID + " borrowed a item : " + item.getTitle() + " , itemID : "
				+ item.getItemID() + ".");

	}

}
