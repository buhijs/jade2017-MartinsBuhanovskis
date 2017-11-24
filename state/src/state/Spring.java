package state;

public class Spring implements Season{

	@Override
	public void theSeason(SeasonContext context) {
		System.out.println("Spring is now");
        context.setSeason(new Summer());
	}

}
