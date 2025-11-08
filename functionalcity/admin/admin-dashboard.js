 function addRow() {
      const name = document.getElementById('name').value;
      const age = document.getElementById('age').value;

      if (name === "" || age === "") {
        alert("Please fill both fields!");
        return;
      }

      const table = document.getElementById('userTable').getElementsByTagName('tbody')[0];
      const newRow = table.insertRow();

      const nameCell = newRow.insertCell(0);
      const ageCell = newRow.insertCell(1);

      nameCell.textContent = name;
      ageCell.textContent = age;

      // clear inputs
      document.getElementById('name').value = "";
      document.getElementById('age').value = "";
    }