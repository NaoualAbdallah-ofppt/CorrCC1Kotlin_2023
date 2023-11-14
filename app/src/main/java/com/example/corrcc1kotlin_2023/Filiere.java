package com.example.corrcc1kotlin_2023;

import java.util.ArrayList;

public class Filiere
    implements IMaj<Module>

{
ArrayList<Module> lstModules = new ArrayList<>();

    @Override
    public boolean create(Module o) {
        if (findById(o.getId())==null) {
            lstModules.add(o);
            return  true;
        }

        return false;

    }

    @Override
    public boolean delete(Module o) {
        if (findById(o.getId())!=null) {
            lstModules.remove(o);
            return  true;
        }

        return false;
    }

    @Override
    public boolean update(Module o) {

        for (Module M : lstModules)
        {
            if (M.getId()==o.getId()) {
                M= o;
                return true;
            }
        }
        return false;
    }

    @Override
    public Module findById(int id) {
        for (Module M : lstModules)
        {
            if (M.getId()==id)
                return M;
        }
        return null;
    }

    @Override
    public ArrayList<Module> findAll() {
        return  lstModules;

    }
}
