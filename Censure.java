package serie11_e;

class Censure {
	
	public static void main(String[] args) {
		Site s1 = new Site("cowww.epfl.ch/coursOOP/", "Prof d'info");
		Site s2 = new Site("www.PCcrackers.com", "Hackers Inc.");
		try {
			System.out.println("Trying " + s1.getAddress());
			s1.connect();
			System.out.println("Argh !!");
			try {
				System.out.println("Trying " + s2.getAddress());
				s2.connect();
				System.out.println("Woaw !");
			} catch (NietException e) {
				System.out.println(e.getMessage());
				System.out.println("Do you really want to be here ?");
				throw e;
			} finally {
				System.out.println("Finally !");
			}
			System.out.println("Happy end!");
		} catch (NietException e) {
			System.out.println(e.getMessage());
			System.out.println("Is Big brother watching you ?");
		}
		System.out.println("Stop surfing !");
	}
}

class Site {

	private String address;
	private String source;
	
	public Site(String address, String source) {
		this.address = address;
		this.source = source;
	}
	
	public void connect() throws NietException {
		if (source.equals("Hackers Inc.")) {
			throw new NietException();
		} else {
			System.out.println("Connected to " + address);
		}
	}
	
	public String getAddress() {
		return address;
	}
}

class NietException extends Exception {

	public NietException() {}

	@Override
	public String getMessage() {
		return "Illegal move";
	}

//	Trying cowww.epfl.ch/coursOOP/
//	Connected to cowww.epfl.ch/coursOOP/
//	Argh !!
//	Trying www.PCcrackers.com
//	Illegal move
//	Do you really want to be here ?
//	Finally !
//	Illegal move
//	Is Big brother watching you ?
//	Stop surfing !

}