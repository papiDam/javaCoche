import mysql.connector # Se instala en el CMD con: pip install mysql-connector-python

# Creo la conexión a BBDD
miBBDD = mysql.connector.connect(
  host="localhost",
  user="root",
  password="",
  database="banco"
)

# Creo el cursor que voy a usar
miCursor = miBBDD.cursor()

def listarPersonas(posicion):
    sqlString = "SELECT * FROM persona LIMIT %s, 5"
    miCursor.execute(sqlString, [posicion])
    misPersonas = miCursor.fetchall()
    return misPersonas

def imprimirListas(lista):
    for item in lista:
        print(item)

opcion = ""

print ("Menu")
while opcion != "2":
    print ("1. Listar todos los usuarios")
    print ("2. Salir del programa")
    opcion = input("¿Qué opcion quieres hacer? ")

    if opcion == "1":
        posicion = 0
        while posicion <50:
            misPersonas = listarPersonas(posicion)
            imprimirListas(misPersonas)
            print("Siguiente (S)")
            print("Retroceder (R) \n")
            avanzar = input()
            if avanzar == "S":
                posicion += 5
            elif avanzar == "R":
                posicion -= 5

miCursor.close()
miBBDD.close()
