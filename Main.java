/**
 * Main.java - Driver class to demonstrate revised historical examples
 * 
 * @author Dalia Bisevac
 * @version 1.0
 */

public class Main {
	public static void main(String[] args) {
		String tulsaDescription = "A black teenager, who was working as a shoe shiner in downtown Tulsa, Oklahoma, was arrested and accused of assaulting a white woman on a public elevator in broad daylight. A group of white vigilantes, intent on lynching him, and armed black men intent on protecting him gathered at the courthouse. A shot rang out, and the violence began. The riot resulted in 35 square blocks of destruction, including more than 1,250 homes, churches, schools, businesses, a hospital, and a library.";
		Date tulsaDay = new Date(5, 31, 1921);
		HistoricalEvent tulsaRiot = new HistoricalEvent(tulsaDescription, tulsaDay);

		System.out.println("====================================================");
		System.out.println("HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		System.out.println(tulsaRiot);
		
		
		String tulsaRevised = "It started with newspaper reports that a black man had assaulted a white elevator operator. He was arrested, and black World War I vets rushed to the courthouse to prevent a lynching. Whites were deputized and handed weapons, the shooting started and then it got out of hand. It was mob rule for two days, and the result was the complete devastation of the entire black community. The white mobs looted the homes and businesses before they set fire to the community. Planes circled mid-air and bombed what was known as Black Wall Street. The National Guard was called out after the governor declared martial law, and imprisoned all blacks that were not already in jail. More than 35 blocks were destroyed, along with more than 1,200 homes, and some 300 people died, mostly Blacks.",
			tulsaCitation = "https://www.smithsonianmag.com/smithsonian-institution/long-lost-manuscript-contains-searing-eyewitness-account-tulsa-race-massacre-1921-180959251/";
		RevisedHistoricalEvent tulsaMassacre = new RevisedHistoricalEvent(tulsaDescription, tulsaDay,
			tulsaRevised, tulsaCitation);
		
		System.out.println("\n====================================================");
		System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		tulsaMassacre.teach();

		// My example is the Bosnian Genocide 
        String bosniaDescription = "During the early 1990s there was a breakup of Yugoslavia, the country comprised of multiple Balkan countries (such as Bosnia, Montenegro, Croatia, etc), a brutal conflict took place between Bosnian and Serbian forces in Bosnia and Herzegovina with a great number of casualties and many mass expulsions.";
        Date bosniaDate = new Date(7, 11, 1995); // Srebrenica massacre date in July 1995

        // Revised description of the genocide
        String bosniaRevised = "On July 11, 1995, Serbian miliary forces overran the UN-protected town of Srebrenica, filled with an entirely civilian population. " +
                "In the aftermath of this ambush, approximately 8,000 (and counting as bodies are still being uncovered to this day) Bosniak (Bosnian Muslim) men and boys were systematically separated, detained in concentration camps and executed in a campaign that international courts and the United Nations have recognized as genocide. " +
                "These killings were followed by mass burials, later investigations and trials (as cited by the ICTY and successor tribunals) established responsibility for planning and executing large-scale atrocities with no regard to war crime insinuations and have prosecuted senior leaders for genocide and related crimes.";
        // Reputable sources: ICTY judgement(s) and USHMM summary
        String bosniaCitation = "ICTY judgement (Krstic)/ICTY documents: https://www.icty.org/x/cases/krstic/tjug/en/krs-tj010802e.pdf | USHMM: https://www.ushmm.org/genocide-prevention/countries/bosnia-herzegovina";

        RevisedHistoricalEvent bosniaEvent = new RevisedHistoricalEvent(bosniaDescription, bosniaDate, bosniaRevised, bosniaCitation);

        System.out.println("\n\n====================================================");
        System.out.println("ADDITIONAL REVISED HISTORICAL EVENT (Student Submission):");
        System.out.println("====================================================");
        bosniaEvent.teach();
	}
}