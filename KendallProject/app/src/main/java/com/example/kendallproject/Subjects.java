package com.example.kendallproject;

import java.util.ArrayList;
import java.util.Iterator;

public class Subjects {
	
	public Map<String, String> getMap ()
	{
		Map<String, String> subjects = new ArrayMap< >();
		//Map<String, String> subjects = new HashMap< >();
		
		subjects.add("Accounting", "ACCT");
		subjects.add("Accounting (Woods College)", "ADAC");
		subjects.add("African American Dispora", "AADS");
		subjects.add("Art History", "ARTH");
		subjects.add("Biology", "BIOL");
		subjects.add("Biology (Woods College)", "ADBI");
		subjects.add("Business Analytics", "BZAN");
		subjects.add("Business Law", "BSLW");
		subjects.add("Business Management (Woods College)", "ADBM");
		subjects.add("Business Writing and Communication", "BCOM");
		subjects.add("Capstone", "UNCP");
		subjects.add("Chemistry", "CHEM");
		subjects.add("Christian Ethics", "TMCE");
		subjects.add("Classics", "CLAS");
		subjects.add("Communication", "COMM");
		subjects.add("Communication (Woods College)", "ADCO");
		subjects.add("Computer Science", "CSCI");
		subjects.add("Cornerstone", "UNCS");
		subjects.add("Corporate Systems (Woods College)", "ADSY");
		subjects.add("Counseling, Developmental and Educational Psychology", "APSY");
		subjects.add("Criminal Justice", "ADCJ");
		subjects.add("Cyber Security", "ADCY");
		subjects.add("Earth & Environmental Studies", "EESC");
		subjects.add("East Asian Languages and Civilizations", "EALC");
		subjects.add("Economics", "ECON");
		subjects.add("Economics (Woods College", "ADEC");
		subjects.add("Educational Leadership and Higher Education", "ELHE");
		subjects.add("Engineering Human Centered", "");
		subjects.add("English", "ENGL");
		subjects.add("English (Woods College)", "ADEN");
		subjects.add("Environmental Studies", "ENVS");
		subjects.add("Examined Life", "ADEX");
		subjects.add("Experience, Reflection, Action: Lynch", "ERAL");
		subjects.add("Film Studies", "FILM");
		subjects.add("Film (Woods College)", "ADFM");
		subjects.add("Finance", "MFIN");
		subjects.add("Finance (Woods College)", "ADFN");
		subjects.add("Fine Arts (Wood College)", "ADFA");
		subjects.add("Formative Education", "FORM");
		subjects.add("Forensics", "FORS");
		subjects.add("French", "FREN");
		subjects.add("German", "GERM");
		subjects.add("Global Public Health and the Common Good", "PHCG");
		subjects.add("Healthcare Administration", "ADHA");
		subjects.add("History", "HIST");
		subjects.add("History (Woods College)", "ADHS");
		subjects.add("History of Christianity", "TMHC");
		subjects.add("Information Technology (Woods College)", "ADIT");
		subjects.add("Information Systems", "ISYS");
		subjects.add("International Studies", "INTL");
		subjects.add("Islamic Civilization & Societies", "ICSP");
		subjects.add("Italian", "ITAL");
		subjects.add("Jesuit Studies", "JESU");
		subjects.add("Journalism", "JOUR");
		subjects.add("Law", "LAWS");
		subjects.add("Law (Woods College)", "ADLA");
		subjects.add("Leadership and Administration (Woods College)", "ADGR");
		subjects.add("Learning Engineering", "LREN");
		subjects.add("Linguistics", "LING");
		subjects.add("Management Elective", "GSOM");
		subjects.add("Management & Organization", "MGMT");
		subjects.add("Marketing", "MKTG");
		subjects.add("Marketing (Woods College)", "ADMK");
		subjects.add("Mathematics", "MATH");
		subjects.add("Mathematics (Woods College)", "ADMT");
		subjects.add("Measurement, Evaluation, Statistics and Assessment", "MESA");
		subjects.add("Military Science", "ROTC");
		subjects.add("Music Academic", "MUSA");
		subjects.add("Music Performance", "MUSP");
		subjects.add("Near Eastern Languages and Civilizations", "NELC");
		subjects.add("Nursing", "NURS");
		subjects.add("New Testament", "TMNT");
		subjects.add("Old Testament", "TMOT");
		subjects.add("Palliative Care", "HLTH");
		subjects.add("Pastoral Studies", "TMPS");
		subjects.add("Philosophy", "PHIL");
		subjects.add("Philosophy (Woods College)", "ADPL");
		subjects.add("Physics", "PHYS");
		subjects.add("Political Science", "POLI");
		subjects.add("Political Science (Woods College)","ADPO");
		subjects.add("Portico", "PRTO");
		subjects.add("Psychology", "PSYC");
		subjects.add("Psychology (Woods College)", "ADPS");
		subjects.add("Religious Education", "TMRE");
		subjects.add("Romance Language & Literatures", "RLRL");
		subjects.add("Slavic Studies", "SLAV");
		subjects.add("Social Work", "SCWK");
		subjects.add("Sociology", "SOCY");
		subjects.add("Sociology (Woods College)", "ADSO");
		subjects.add("Spanish", "SPAN");
		subjects.add("Sports Administration", "ADSA");
		subjects.add("Studio Art", "ARTS");
		subjects.add("Sustainability", "ADSB");
		subjects.add("Systematic and Historical Theology", "TMST");
		subjects.add("Teacher Education and Curriculum and Instruction", "EDUC");
		subjects.add("Theater", "THTR");
		subjects.add("Theology", "THEO");
		subjects.add("Theology (Woods College)", "ADTH");
		subjects.add("Theology and Ministry Course Area Unspecified", "TMTM");
		subjects.add("Theology and Ministry Practical Theology", "TMPT");
		subjects.add("Undergraduate Management", "UGMG");
		subjects.add("University Courses", "UNAS");
		
		return subjects;
	}
	
	public ArrayList<String> getList ()
	{
		Map<String, String> a = getMap();
		ArrayList<String> subArr = new ArrayList<String> (a.size());
		Iterator<String> iter = a.iterator();
		iter = a.iterator();
		int i = 0;
		while (iter.hasNext())
		{	String subject = iter.next();
			subArr.add(subject);
			i++;
		}	
		
		return subArr;
	}
	
	//public static void main(String[] args)
//	{
	//	Subjects subj = new Subjects();
	//	String[] options = subj.getArray();
	//	System.out.println(options[0]);
//	}

}
