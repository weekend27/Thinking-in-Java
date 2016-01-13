package interfaces.filters;

public class Waveform {
	private static long cnt;
	private final long id = cnt++;
	public String toString() {return "Waveform " + id;}
}
