nome = input("Digite seu nome: ")
idade = int(input("Digite sua idade: "))
peso = float(input("Digite seu peso: "))

print("Seu nome é " + nome)
print(idade)
print(peso)

if idade>=18:
  print("Você é de maior")
else:
  print("Você é de menor")

if peso<=40:
  print("Você está abaixo do peso")
elif peso>40 and peso<=60:
  print("Você está magro")
else:
  print("Você está normal")
  
vet1 = [10, 20, 30]
print(vet1[0])
print(vet1[1])
print(vet1[2])

vet2 = []
vet2.append("Gui")
vet2.append("Lindo")
print(vet2)

for x in range(5):
  print("Faço sexo")