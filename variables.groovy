// mesma regra do arduino, case sensitive

println("teste")
println "I am here in this line"


// this is define name
def String name = "vini"


println 'Print name is :' + name

// here is a single quotes
println 'name is : ${name}'

// here us a double quotes, here a 
println "name is : ${name}"



def x = 10;
def y = 20;

println "this is value for ${x}"

println "This is value for ${y}"


// groovy is dynamic typing


def (String a, int b, double c) = [30, 40, 50]

println a
println b
println c