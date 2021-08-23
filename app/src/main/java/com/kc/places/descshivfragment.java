package com.kc.places;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class descshivfragment extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;
    String pname;
    String pimage;
    String pdesc;
    ImageView map;
    String url;
    ImageView back;

    public descshivfragment() {
        // Required empty public constructor
    }
    public descshivfragment(String pname,String pimage,String pdesc) {

        this.pname = pname;
        this.pimage = pimage;
        this.pdesc = pdesc;
    }


    public static descshivfragment newInstance(String param1, String param2) {
        descshivfragment fragment = new descshivfragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_descshivfragment, container, false);


        pdesc.contains("\n");
        ImageView pimageholder = view.findViewById(R.id.pimageholder);
        TextView pnameholder = view.findViewById(R.id.pnameholder);
        TextView pdescholder = view.findViewById(R.id.pdescholder);
        back = view.findViewById(R.id.backdist);

        pnameholder.setText(pname);
        pdescholder.setText(pdesc);
        Glide.with(getContext()).load(pimage).into(pimageholder);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppCompatActivity activity =(AppCompatActivity)view.getContext();
                activity.getSupportFragmentManager().popBackStack();

            }
        });

        map = view.findViewById(R.id.map);

        //shivamogga places map urls

        if(pname.equals("Jog Falls")){
            url = "https://www.google.co.in/maps/search/jogfalls/@14.0716506,75.2595727,15z";
        }

        else if(pname.equals("Bhadra wildlife sanctuary")){
            url = "https://www.google.com/maps/place/Bhadra+Wildlife+Sanctuary/@13.6913313,75.6380634,15.33z/data=!4m5!3m4!1s0x3bbb2029086af8a9:0xacab84f30b64a71d!8m2!3d13.6948738!4d75.635227";
        }
        else if(pname.equals("Kuppali")){
            url = "https://www.google.com/maps/place/Kuppali,+Karnataka+577415/@13.6003478,75.3105926,16z/data=!3m1!4b1!4m5!3m4!1s0x3bbb6ce87f1fd47b:0xbcd210fe07ccef74!8m2!3d13.5993531!4d75.3164374";
        }
        else if(pname.equals("Tiger and Lion Safari")){
            url = "https://www.google.com/maps/place/Shimoga+Zoo+%26+Safari/@13.9719682,75.4914349,17z/data=!3m1!4b1!4m5!3m4!1s0x3bbba5a54501b591:0x309931dfeed42a1d!8m2!3d13.9719682!4d75.4936236";
        }
        else if(pname.equals("Keladi")){
            url = "https://www.google.com/maps/place/Keladi,+Karnataka+577430/@14.2243022,75.016594,15z/data=!4m13!1m7!3m6!1s0x3bbbf4fdf2b53dbf:0x6aef25f29ac7ae61!2sKeladi,+Karnataka+577430!3b1!8m2!3d14.2176458!4d75.0173035!3m4!1s0x3bbbf4fdf2b53dbf:0x6aef25f29ac7ae61!8m2!3d14.2176458!4d75.0173035";
        }
        else if(pname.equals("Nagara Fort")){
            url = "https://www.google.com/maps/place/Nagara,+Karnataka/@13.8204132,75.0218645,15z/data=!3m1!4b1!4m5!3m4!1s0x3bbb81dee42c5435:0x2f7eff6ccf79a3e6!8m2!3d13.8215909!4d75.0304481";
        }
        else if(pname.equals("Kodachadri")){
            url = "https://www.google.com/maps/place/Kodachadri/@13.8616482,74.8727434,17z/data=!3m1!4b1!4m5!3m4!1s0x3bbc7e821b69ecbd:0xda49a0c5fb990c8b!8m2!3d13.8623079!4d74.8752009";
        }
        else if(pname.equals("Barkana Falls")){
            url = "https://www.google.com/maps/place/Barkana+falls/@13.488147,75.0847935,15z/data=!3m1!4b1!4m5!3m4!1s0x3bbb6712fcbb69bd:0xcb1e6f3443641ddc!8m2!3d13.4881474!4d75.0935483";
        }
        else if(pname.equals("Kavaledurga Fort")){
            url = "https://www.google.com/maps/place/Kavaledurga,+Karnataka+577448/@13.7181967,75.1196321,17z/data=!3m1!4b1!4m5!3m4!1s0x3bbb7a3a28f15b17:0xfe806a77784e7767!8m2!3d13.7181967!4d75.1218208";
        }else if(pname.equals("Sharavathi Valley Wildlife Sanctuary")){
            url = "https://www.google.com/maps/place/Sharavati+Valley+Wildlife+Sanctuary/@14.0390992,74.9186885,17z/data=!3m1!4b1!4m5!3m4!1s0x3bbc76664b17889b:0x3aed952e47e24900!8m2!3d14.0390992!4d74.9208772";
        }
        else if(pname.equals("Agumbe")){
            url = "https://www.google.com/maps/place/Agumbe+Sunset+View+Point/@13.4976883,75.0724471,15z/data=!3m1!4b1!4m5!3m4!1s0x3bbb6723217967a9:0xc2023072fa42c915!8m2!3d13.4976887!4d75.0812019";
        }
        else if(pname.equals("Sakrebyle Elephant Camp")){
            url = "https://www.google.com/maps/place/Sakrebyle+elephant+camp/@13.8385226,75.508014,16z/data=!4m9!1m2!2m1!1sSakrebyle+Elephant+Camp!3m5!1s0x3bbb09ed15955e71:0x5a26a2af1f4679fa!8m2!3d13.8407399!4d75.5134146!15sChdTYWtyZWJ5bGUgRWxlcGhhbnQgQ2FtcFoZIhdzYWtyZWJ5bGUgZWxlcGhhbnQgY2FtcJIBEnRvdXJpc3RfYXR0cmFjdGlvbpoBI0NoWkRTVWhOTUc5blMwVkpRMEZuU1VOeFp5MVRTVlYzRUFF";
        }





    //kodagu places map urls


        else if(pname.equals("Abbe Falls")){
            url = "https://www.google.com/maps/place/Abbey+Falls/@12.4580585,75.714451,878m/data=!3m2!1e3!4b1!4m5!3m4!1s0x3ba50117193e9c57:0x63443e86e97f5029!8m2!3d12.4580585!4d75.7166397";
        }
        else if(pname.equals("Iruppu Falls")){
            url = "https://www.google.com/maps/place/Iruppu+Waterfalls,+Brahmagiri/@11.9661026,75.9811405,880m/data=!3m2!1e3!4b1!4m5!3m4!1s0x3ba5c472e19647c1:0x644caabd68c52e9d!8m2!3d11.9661026!4d75.9833292";
        }
        else if(pname.equals("Mallalli Falls")){
            url = "https://www.google.com/maps/place/Mallalli+Waterfalls/@12.680643,75.7214783,878m/data=!3m2!1e3!4b1!4m5!3m4!1s0x3ba51de48fdc729b:0x649b67a3f4bccf84!8m2!3d12.680643!4d75.723667";
        }else if(pname.equals("Raja's Seat")){
            url = "https://www.google.com/maps/place/Raja's+Seat/@12.4141582,75.7347679,878m/data=!3m2!1e3!4b1!4m5!3m4!1s0x3ba5aa988443072d:0xb76c80aaf1f5260c!8m2!3d12.4141582!4d75.7369566";
        }
        else if(pname.equals("Namdroling Monastery")){
            url = "https://www.google.com/maps/place/Namdroling+Monastery+Golden+Temple/@12.4306948,75.9643611,878m/data=!3m2!1e3!4b1!4m5!3m4!1s0x3ba5a760db95df17:0xf81bb0392f364ea7!8m2!3d12.4306948!4d75.9665498";
        }
        else if(pname.equals("Harangi Dam")){
            url = "https://www.google.com/maps/place/Harangi+Reservoir,+Kudumangalore,+Karnataka+571232/@12.491667,75.9033673,878m/data=!3m2!1e3!4b1!4m5!3m4!1s0x3ba5089c77962229:0x9e95a1a233dd1f2d!8m2!3d12.491667!4d75.905556";
        }
        else if(pname.equals("Dubare Elephant Camp")){
            url = "https://www.google.com/maps/place/Dubare+Elephant+Camp-+Jungle+Lodges/@12.370573,75.9032214,879m/data=!3m2!1e3!4b1!4m8!3m7!1s0x3ba5a6213b0cc98d:0x40de9c04d7600912!5m2!4m1!1i2!8m2!3d12.370573!4d75.9054101";
        }
        else if(pname.equals("Nagarhole National Park")){
            url = "https://www.google.com/maps/place/Nagarahole+National+Park+And+Tiger+Reserve/@12.0314216,76.1119274,3519m/data=!3m1!1e3!4m13!1m6!2m5!1sNagarhole+National+Park!5m3!5m2!4m1!1i2!3m5!1s0x3ba5c3acd26b17a7:0x40bef93e31fc1869!8m2!3d12.0314216!4d76.1206821!15sChdOYWdhcmhvbGUgTmF0aW9uYWwgUGFya1oZIhduYWdhcmhvbGUgbmF0aW9uYWwgcGFya5IBDW5hdGlvbmFsX3Bhcms";
        }
        else if(pname.equals("Talacauvery")){
            url = "https://www.google.com/maps/place/Tala+Kaveri,+Karnataka+571247/@12.3841858,75.4905581,879m/data=!3m2!1e3!4b1!4m5!3m4!1s0x3ba4584332ac11c7:0x623bac3828517882!8m2!3d12.3835908!4d75.4941839";
        }



        //hassan maps

        else if(pname.equals("Kedareshwara Temple")){
            url = "https://www.google.com/maps/place/Kedareshwara+Temple/@14.6735863,74.9382572,870m/data=!3m2!1e3!4b1!4m5!3m4!1s0x3bbeace1c5a7fefb:0x109ef2bc90c65818!8m2!3d14.673599!4d74.9404623";
        }
        else if(pname.equals("Shettihalli Church")){
            url = "https://www.google.com/maps/place/Shettihalli+Church/@12.869655,76.0159637,877m/data=!3m2!1e3!4b1!4m5!3m4!1s0x3ba53ec0d2069c83:0x60b5e1ff1bbe4dd0!8m2!3d12.869655!4d76.0181524";
        }
        else if(pname.equals("Gorur Dam")){
            url = "https://www.google.com/maps/place/Gorur+Dam,+Konapura,+Karnataka+573120/@12.8219579,76.0523229,877m/data=!3m2!1e3!4b1!4m5!3m4!1s0x3ba53fc762f3f175:0x183d666dcd995cf!8m2!3d12.8219579!4d76.0545116";
        }
        else if(pname.equals("Bisle Ghat")){
            url = "https://www.google.com/maps/place/Bisle,+Karnataka+573123/@12.7188411,75.680941,1755m/data=!3m2!1e3!4b1!4m5!3m4!1s0x3ba4e1b97c573d9b:0x217c213835781c2c!8m2!3d12.71983!4d75.6856818";
        }
        else if(pname.equals("Lakshmi Narasimha Temple")){
            url = "https://www.google.com/maps/place/Nuggehalli+Sri+Lakshmi+Narasimha+Temple/@13.0109318,76.4730023,876m/data=!3m2!1e3!4b1!4m5!3m4!1s0x3baff81974555c75:0xeb17326ce68fa677!8m2!3d13.0109318!4d76.475191";
        }
        else if(pname.equals("Hasanamba Temple")){
            url = "https://www.google.com/maps/place/Hasanamba+Temple/@13.0028115,76.092487,876m/data=!3m2!1e3!4b1!4m5!3m4!1s0x3ba548187a3963cb:0x29a7a51dd0173857!8m2!3d13.0027477!4d76.094664";
        }
        else if(pname.equals("Maharaja Park")){
            url = "https://www.google.com/maps/place/Maharaja+Park/@13.0080999,76.0976758,876m/data=!3m2!1e3!4b1!4m5!3m4!1s0x3ba5483c88c86893:0x43e9a17d336029d8!8m2!3d13.0080999!4d76.0998645";
        }
        else if(pname.equals("Bhagwan Bahubali statue")){
            url = "https://www.google.com/maps/place/Shri+Bhagwan+Bahubali+Digambar+Jain+Statue,+Ujire-Dharmastala+Rd,+Dharmasthala,+Karnataka+574216/@12.9552071,75.3768298,877m/data=!3m2!1e3!4b1!4m5!3m4!1s0x3ba4c865ab181569:0x73e8100468e99319!8m2!3d12.9552071!4d75.3790185";
        }


        //mysore map urls

        else if(pname.equals("Mysore Palace (Amba Vilas)")){
            url = "https://www.google.com/maps/place/Mysore+Palace/@12.305163,76.6529862,879m/data=!3m2!1e3!4b1!4m5!3m4!1s0x3baf701103f9a1f9:0xc37fbae2a124da0d!8m2!3d12.305163!4d76.6551749";
        }
        else if(pname.equals("Jaganmohan Palace")){
            url = "https://www.google.com/maps/place/Jaganmohan+Palace+Art+Gallery+And+Auditorium/@12.3068751,76.647674,879m/data=!3m2!1e3!4b1!4m5!3m4!1s0x3baf700e61f5f96d:0xf53a44a722005fcc!8m2!3d12.3069775!4d76.6498743";
        }
        else if(pname.equals("Chamundeshwari Temple")){
            url = "https://www.google.com/maps/place/Chamundi+Temple/@12.2962048,76.6288143,3516m/data=!3m1!1e3!4m9!1m2!2m1!1sChamundeshwari+Temple+mysore!3m5!1s0x3baf7aa9649d5695:0x24d29c191274f7c7!8m2!3d12.2962!4d76.6375691!15sChxDaGFtdW5kZXNod2FyaSBUZW1wbGUgbXlzb3JlWh4iHGNoYW11bmRlc2h3YXJpIHRlbXBsZSBteXNvcmWSAQxoaW5kdV90ZW1wbGWaASNDaFpEU1VoTk1HOW5TMFZKUTBGblNVTjVOVmxQYVVWQkVBRQ";
        }
        else if(pname.equals("Philomena’s Cathedral")){
            url = "https://www.google.com/maps/place/St.+Philomena's+Cathedral/@12.3210417,76.6560748,879m/data=!3m2!1e3!4b1!4m5!3m4!1s0x3baf706ecbc32f59:0x8e900b9cb740e32d!8m2!3d12.3208715!4d76.6582409";
        }
        else if(pname.equals("Rail Museum")){
            url = "https://www.google.com/maps/place/Mysuru+Rail+Museum/@12.3163393,76.6411343,879m/data=!3m2!1e3!4b1!4m5!3m4!1s0x3baf7075a5dd3cd3:0x31cb5be481e0c44a!8m2!3d12.3163393!4d76.643323";
        }
        else if(pname.equals("Somnathpur")){
            url = "https://www.google.com/maps/place/Somanathapura,+Karnataka+571120/@12.2761126,76.8804951,879m/data=!3m2!1e3!4b1!4m5!3m4!1s0x3baf125cc68e0859:0xb885149b5db7b0bb!8m2!3d12.2758033!4d76.8821849";
        }
        else if(pname.equals("Brindavan Gardens")){
            url = "https://www.google.com/maps/place/Brindavan+Gardens/@12.4217156,76.5705975,878m/data=!3m2!1e3!4b1!4m5!3m4!1s0x3baf78e109feca5d:0x915fba7ee0e6b6b2!8m2!3d12.4217156!4d76.5727862";
        }
        else if(pname.equals("Sri Chamarajendra Zoological Gardens")){
            url = "https://www.google.com/maps/place/Sri+Chamarajendra+Zoological+Gardens/@12.3022057,76.6619995,879m/data=!3m2!1e3!4b1!4m5!3m4!1s0x3baf7023040e7795:0xea57334ccb6cbfcb!8m2!3d12.3022057!4d76.6641882";
        }



        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotUrl(url);
            }
        });




        return view;
    }

    private void gotUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }


    }
