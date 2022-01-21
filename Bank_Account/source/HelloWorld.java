/* FeatureIDE - A Framework for Feature-Oriented Software Development
 * Copyright (C) 2005-2019  FeatureIDE team, University of Magdeburg, Germany
 *
 * This file is part of FeatureIDE.
 * 
 * FeatureIDE is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * FeatureIDE is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with FeatureIDE.  If not, see <http://www.gnu.org/licenses/>.
 *
 * See http://featureide.cs.ovgu.de/ for further information.
 */

/**
 * Hello World example for FeatureIDE projects using Munge as preprocessor.
 * 
 * @author Thomas Thuem
 */
public class HelloWorld {
	/*@
	 @ requires true;
	 @ ensures true;
	 @ assignable \nothing;
	 @*/
	void nextDay(Account account) {
		
		account.interest += account.calculateInterest();
	}

	/*@
	 @ requires true;
	 @ ensures true;
	 @ assignable \nothing;
	 @*/
	void nextYear(Account account) {
		account.balance += account.interest;
		account.interest = 0;
	}
	public static void main(String[] args){
		/*@ invariant account != null; @*/
		Account account = new Account();

		
		System.out.println("Hello");
		
		/*if[Type]*/
		System.out.println("Type");
		/*end[Type]*/
		
		/*if[Interest]*/
		System.out.println("Interest");
		/*end[Interest]*/
		
		/*if[Retrait]*/
		System.out.println("Retrait");
		/*end[Retrait]*/
		
		/*if[Lock]*/
		System.out.println("Lock");
		/*end[Lock]*/
	}
	
}
