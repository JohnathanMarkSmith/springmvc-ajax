package com.johnathanmarksmith.service;

import com.johnathanmarksmith.domain.Person;

/**
 * Date:   6/12/13 / 7:49 AM
 * Author: Johnathan Mark Sm
 * Email:  johnathansmith1969@gmail.com
 * <p/>
 * Comments:
 *
 *   This is the interface to the person service.
 */


public interface PersonService
{
    public Person getRandom();

    public Person getById(Long id);

    public void save(Person person);
}
