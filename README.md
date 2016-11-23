# ModuleLib
Library for using Modules in Java Projects based on the the reflection API

#Building
	
To build, run:

    ant

#Manifest

For modules to be recognized, a jar must add following to its manifest:

	Module: true
	
	Module-Descriptors:
	Module-Descriptor0: <path to ModuleDescriptor class>

There can be multiple Modules inside a jar e.g.:

	Module: true
	
	Module-Descriptors:
	Module-Descriptor0: com.packagename.test.TestModuleDescriptor1
	Module-Descriptor1: com.packagename.test2.TestModuleDescriptor2

#Examples

  For examples, refer to the examples folder
    
#License

This is under the GPLv3 license.
