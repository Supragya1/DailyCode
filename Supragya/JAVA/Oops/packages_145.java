// Day122_Q2.java
//! Packages is a collection of related classes , interfaces and sub packages.
//! Packages in java is a mechanism to encapsulate a group of classes, sub packages and interfaces. Packages are used for:
//% Preventing naming conflicts. For example there can be two classes with name Employee in two packages, college.staff.cse.Employee and college.staff.ee.Employee
//% Making searching/locating and usage of classes, interfaces, enumerations and annotations easier
//% Packages can be considered as data encapsulation (or data-hiding).
//% We can have 4 different access modifiers for different scope of classes, constructors, data members and member functions. They are −
//% Public − scope is everywhere. in the same class, in the same package, in the sub classes and the classes which are present in other packages.
//% Private − scope is only in the same class.
//% Protected − scope is in the same class, in the same package, in the sub classes of same package and the subclasses which are present in other packages.
//% Default − scope is in the same class, in the same package.
//$ The import keyword is used to make the classes and interfaces of another package accessible to the current package.
//$ The syntax to import a package is − import package.name.*;
//$ If we use import package.name.classname, then only declared class of this package will be accessible.
//$ We can import the specific class from a package too. In such case, import statement will be − import package.name.classname;
//$ If we import a package, subpackages will not be imported.
//$ If we import a package, all the classes and interfaces of that package will be imported excluding the classes and interfaces of the subpackages.
//@ There are two types of packages in Java: built-in packages and the packages we can create (also known as user defined package).
//@ There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.
//@ There are three ways to access the package from outside the package.
//% import package.*;
//% import package.classname;
//% fully qualified name.
//& To make a class into package we have to use package keyword.
//& The first statement in the source file should be the package declaration.
//& We can have only one package statement in a source file.
//& The package statement must be the first line in the source file. There can be only comments and white spaces before the package statement.
//& If we are not importing a package explicitly, then the classes present in the current package will be automatically imported.
//& The package statement defines a name space in which classes are stored.
//* when we declare a package,then a new folder is created with the same name as the package name. where all the classes are stored.
//* The package statement is optional. If we don't declare the package at the top of the java file, then it will be placed in the default package.
//* To compile command is javac -d . file_name.java
//* To run command is java pack_name.class_name
package pack145;
import java.util.*;
public class packages_145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double r = sc.nextDouble();
        double area = 3.14*r*r;
        System.out.println("The area of the circle is "+area);
        sc.close();
    }
}
