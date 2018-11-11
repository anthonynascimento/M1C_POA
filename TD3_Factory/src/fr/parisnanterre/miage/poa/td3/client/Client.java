package fr.parisnanterre.miage.poa.td3.client;

import fr.parisnanterre.miage.poa.td3.products.Product;
import fr.parisnanterre.miage.poa.td3.products.ProductFactory;

import java.util.Locale;

/**
 * POA_Patterns
 * Copyright (C) 2016 pascalpoizat (@pascalpoizat)
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

public class Client {
    Product prod1;
    ProductFactory factory;

    Client() {
        // get the locale language in english
        // eg for french, we want "French" and not "français".
        String language = Locale.getDefault().getDisplayLanguage(Locale.ENGLISH);
        // create a factory parameterized by the language
        // nb: the language set up could also have been done in the factory constructor
        // nb: no need to have a singleton factory here
        factory = new ProductFactory(language);
        prod1 = factory.createProduct();
    }

    public void foo() {
        Product myProd1, myProd2;
        prod1.perform();
        myProd1 = factory.createProduct();
        myProd1.perform();
        myProd2 = factory.createProduct();
        myProd2.perform();
    }
}
