package com.eso.crudwithoutroom.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.eso.crudwithoutroom.MainActivity;
import com.eso.crudwithoutroom.R;
import com.eso.crudwithoutroom.databinding.ContactListItemBinding;
import com.eso.crudwithoutroom.db.entity.Contact;

import java.util.ArrayList;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.MyViewHolder>{
    private Context context;
    private ArrayList<Contact> contactssList;
    private MainActivity mainActivity;


    public ContactsAdapter(Context context, ArrayList<Contact> contacts, MainActivity mainActivity) {
        this.context = context;
        this.contactssList = contacts;
        this.mainActivity = mainActivity;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ContactListItemBinding contactListItemBinding = DataBindingUtil.inflate
                (LayoutInflater.from(context),R.layout.contact_list_item,parent,false);
        return new MyViewHolder(contactListItemBinding);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {


        final Contact contact = contactssList.get(position);

        holder.contactListItemBinding.setContact(contact);

        holder.itemView.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                mainActivity.addAndEditContacts(true, contact, position);
            }
        });

    }

    @Override
    public int getItemCount() {

        return contactssList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ContactListItemBinding contactListItemBinding;


        public MyViewHolder(ContactListItemBinding contactListItemBinding) {
            super(contactListItemBinding.getRoot());
            this.contactListItemBinding = contactListItemBinding;

        }
    }
}
