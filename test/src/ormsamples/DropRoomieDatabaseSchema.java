/**
 * Licensee: vr(Universidade do Minho)
 * License Type: Academic
 */
package ormsamples;

import org.orm.ORMDatabaseInitiator;

public class DropRoomieDatabaseSchema {
	public static void main(String[] args) {
		try {
			System.out.println("Are you sure to drop table(s)? (Y/N)");
			java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
			if (reader.readLine().trim().toUpperCase().equals("Y")) {
				ORMDatabaseInitiator.dropSchema(roomie.RoomiePersistentManager.instance());
				roomie.RoomiePersistentManager.instance().disposePersistentManager();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}