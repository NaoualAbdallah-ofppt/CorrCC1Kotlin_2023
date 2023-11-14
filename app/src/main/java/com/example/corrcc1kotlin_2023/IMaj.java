package com.example.corrcc1kotlin_2023;

import java.util.ArrayList;
import java.util.List;

public interface IMaj <T>{
   boolean create (T o) ;
   boolean delete (T o);
   boolean update (T o);
   T findById (int id) ;
    ArrayList<T> findAll ( );
}
