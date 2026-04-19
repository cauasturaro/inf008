class Contact {
    private String name;
    private String phone;
    private String email;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Contact(String name, String phone, String email) {
        this(name, phone);
        this.email = email;

    }

    public String getName() {
        return this.name;
    }
    public String getPhone() {
        return this.phone;
    }
    public String getEmail() {
        return this.email;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String displayInfo() {
        return this.name + " - " + this.phone + " - " + this.email;
        // obs: Um método displayInfo() que *retorna uma string* formatada com todas as informações
    }

    public void updateContact(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }
}

class AddressBook {
    private static Contact list[] = new Contact[10];

    // implicit public AddressBook() {}

    public void addContact(Contact contact) {
        if (list[list.length - 1] == null) {
            for (int i = 0; i < list.length; i++) {
                if(list[i] == null) {
                    list[i] = contact;
                    return;
                }
            }
        }
        System.out.println("Max limit reached for address book");
    }

    public Contact searchContact(String name) {
        if (name == null) return null;

        for (Contact contact : list) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }
}

class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("caua", "75983234123");
        String info = contact1.displayInfo();
        System.out.println(info);
        contact1.updateContact("75983234123", "example@mail.com");
        
        AddressBook addressBook = new AddressBook();
        addressBook.addContact(contact1);
        Contact returnedContact = addressBook.searchContact("caua");
        System.out.println(returnedContact.displayInfo());
    }
}
