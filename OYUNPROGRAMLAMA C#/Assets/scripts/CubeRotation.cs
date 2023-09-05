using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class CubeRotation : MonoBehaviour
{
    
    void Start()
    {
        
    }

     private void FixedUpdate()
    {
       gameObject.transform.Rotate(new Vector3(-1.5f,0f,-1.5f));

    }

   
    void Update()
    {
        
    }
}
