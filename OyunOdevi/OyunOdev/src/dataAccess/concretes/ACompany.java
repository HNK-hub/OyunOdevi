package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.GamerDao;
import entities.concretes.Gamers;

public class ACompany implements GamerDao {

	@Override
	public void add(Gamers gamers) {
		System.out.println("A �irketi taraf�ndan  eklendi " + gamers.getFirstName() );
		
	}

	@Override
	public void delete(Gamers gamers) {
		System.out.println("A �irketi taraf�ndan  silindi "+ gamers.getFirstName()  );
		
	}

	@Override
	public void update(Gamers gamers) {
		System.out.println("A �irketi taraf�ndan  g�ncellendi "+ gamers.getFirstName()  );
		
	}

	@Override
	public Gamers get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Gamers> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
