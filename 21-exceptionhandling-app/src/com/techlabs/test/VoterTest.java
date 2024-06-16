package com.techlabs.test;


import com.techlabs.exception.AgeNotValidException;
import com.techlabs.model.Voter;

public class VoterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Voter voter1=new Voter("Neel",25);
		voter1.vote();
		Voter voter2=new Voter("shivam",15);
		voter2.vote();
		}
		catch(AgeNotValidException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
