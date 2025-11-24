Challenge API GreenWay.

Este é um projeto de API em desenvolvimento com Java utilizando o framework Spring Boot. A aplicação GreenWay é uma plataforma para gestão de endereços e usuários.


Equipe:

- Mariana Roberti Neri - RM: 556284

- Lucas Henrique de Souza Santos - RM: 558241

- Ryan Fernando Lucio da Silva - RM: 555924

Tecnologias utilizadas:

- Java 21
- Spring Boot
- H2 (Banco de Dados em memória)
- Spring Data JPA
- Spring Cache
- OpenAPI/Swagger

Criando a VM no terminal do portal da Azure:

az group create --name grupo-greenway --location brazilsouth

az vm create --resource-group  grupo-greenway --name vm-greenway --image Ubuntu2204 --admin-username admlnx --admin-password Fiap@2tdsvms --generate-ssh-keys

az vm open-port --port 8080 --resource-group grupo-greenway --name vm-greenway --priority 1001

-------------------------------------------------------------------------------------------------------------------------------------------------------------

Acessando a nossa VM (Maquina Virtual): 

ssh @admlnx@ip

-------------------------------------------------------------------------------------------------------------------------------------------------------------

Instalar o Docker: 

sudo apt install -y ca-certificates curl gnupg lsb-release

sudo mkdir -m 0755 -p /etc/apt/keyrings

curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo gpg --dearmor -o /etc/apt/keyrings/docker.gpg

echo "deb [arch=$(dpkg --print-architecture) signed-by=/etc/apt/keyrings/docker.gpg] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable" | sudo tee /etc/apt/sources.list.d/docker.list > /dev/null

sudo apt update

sudo apt install -y docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin

sudo docker --version

----------------------------------------------------------------------------------------------------------------------------------------------------------------

Clonando o repositorio do GitHub:

git clone [link do repositorio]

----------------------------------------------------------------------------------------------------------------------------------------------------------------

cd greenway

sudo usermod -aG docker $USER

exit

-----------------------------------------------------------------------------------------------------------------------------------------------------------------

Acessar novamente a VM (Maquina Virtual): 

ssh admlnx@ip

cd greenway 

docker build -t app-greenway .

docker run -d --name greenway -p 8080:8080 app-greenway

-----------------------------------------------------------------------------------------------------------------------------------------------------------------

Sprint 3

-----------------------------------------------------------------------------------------------------------------------------------------------------------------

Clonar repositorio:

git clone https://github.com/LucasH1303/greenway.git

-----------------------------------------------------------------------------------------------------------------------------------------------------------------

Permissão e execução: 

chmod +x ./script_azure.sh
./script_azure.sh

-----------------------------------------------------------------------------------------------------------------------------------------------------------------

Acessar o MYSQL:

docker run -it --rm mysql:8.0 mysql \
  -h <IP_DO_MYSQL> \
  -P 3306 \
  -u root \
  -p

Enter password: lucas

-----------------------------------------------------------------------------------------------------------------------------------------------------------------

Comandos para ver as tabelas:

show databases;

use decepticonsdb;

show tables;

-----------------------------------------------------------------------------------------------------------------------------------------------------------------

Payloads Json para teste:

Exemplos de payloads para testes da API GreenWay.
