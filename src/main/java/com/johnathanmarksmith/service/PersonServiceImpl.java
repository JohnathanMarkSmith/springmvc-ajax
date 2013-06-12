package com.johnathanmarksmith.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.codetutr.domain.Person;

/**
 * Date:   6/12/13 / 7:45 AM
 * Author: Johnathan Mark Smith
 * Email:  johnathansmith1969@gmail.com
 * <p/>
 * Comments:
 *
 *  This is a DEMO service class.. I really dont do much
 *
 */


@Service
public class PersonServiceImpl implements PersonService
{

    String[] names = {"Johnathan Smith", "Regan Smith", "Sabrina Smith", "Jessica Smith"};

    @Override
    public Person getRandom()
    {
        Person person = new Person();
		person.setName(randomName());
		person.setAge(randomAge());
		return person;
	}

	@Override
	public Person getById(Long id) {
		Person person = new Person();
		person.setName(names[id.intValue()]);
		person.setAge(50);
		return person;
	}
	
	@Override
	public void save(Person person) {
        /**
         *
         * if this was real it would do a call to a DAO or save to a database right now
         *
         */
	}
	
	private Integer randomAge() {
		Random random = new Random();
		return 10 + random.nextInt(100);
	}

	private String randomName() {
		Random random = new Random();
		return names[random.nextInt(names.length)];
	}

}
