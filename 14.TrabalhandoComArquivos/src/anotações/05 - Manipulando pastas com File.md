# Manipulando pastas com File

## Classe File em Java

- **Representação de caminho**
  - A classe `File` não é um arquivo em si, mas uma referência a um caminho (pode ser um arquivo ou diretório).
- **Criação de objeto File**
  - `File path = new File(strPath);`
  - Cria um objeto que aponta para o caminho contido em `strPath`;
- **Listagem de diretórios**
  - `path.listFiles(File::isDirectory);`
  - Retorna um array com todos os subdiretórios dentro do caminho informado;
- **Listagem de arquivos**
  - `path.listFiles(File::isFile);`
  - Retorna um array com todos os arquivos dentro do caminho informado;
- **Criação de diretório**
  - `new File(strPath + "\\subdir").mkdir();`
  - Cria uma nova pasta chamada `subdir` dentro do caminho informado;
  - Retorna `true` se a criação for bem sucedida, `false` caso contrário.
- **Uso em loops**
  - `for(File folder : folders)` → percorre e imprime cada pasta;
  - `for(File file : files)` → percorre e imprime cada arquivo;
- **Encerramento do file**
  - `file.close();` → fecha o objeto para liberar recursos.
