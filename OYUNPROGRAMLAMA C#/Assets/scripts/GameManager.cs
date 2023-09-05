using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;


public class GameManager : MonoBehaviour
{
    karakterMovement _karakterMovement;
    void Start()
    {
        _karakterMovement = GameObject.Find("karakterObje").GetComponent<karakterMovement>();
    }

   
    void Update()
    {
        
    }
    public void OyunBitti()
    {
        _karakterMovement.gameObject.SetActive(false);
        Invoke("OyunSahnesiniYukle",3f);

    }

    public void OyunSahnesiniYukle()
    {
        SceneManager.LoadScene("LobyScene");
    }
}
