
package org.apache.drill.exec.test.generated;

import org.apache.drill.exec.exception.SchemaChangeException;
import org.apache.drill.exec.expr.holders.Float8Holder;
import org.apache.drill.exec.expr.holders.IntHolder;
import org.apache.drill.exec.ops.FragmentContext;
import org.apache.drill.exec.physical.impl.project.ProjectorTemplate;
import org.apache.drill.exec.record.RecordBatch;
import org.apache.drill.exec.vector.Float8Vector;

public class ProjectorGen8
    extends ProjectorTemplate
{

    Float8Vector vv0;
    Float8Holder constant6;
    Float8Vector vv7;
    Float8Vector vv13;

    public ProjectorGen8() {
        try {
            __DRILL_INIT__();
        } catch (SchemaChangeException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    public void doEval(int inIndex, int outIndex)
        throws SchemaChangeException
    {
        {
            Float8Holder out3 = new Float8Holder();
            {
                out3 .value = vv0 .getAccessor().get((inIndex));
            }
            Float8Holder out10 = new Float8Holder();
            {
                out10 .value = vv7 .getAccessor().get((inIndex));
            }
            //---- start of eval portion of subtract function. ----//
            Float8Holder out11 = new Float8Holder();
            {
                final Float8Holder out = new Float8Holder();
                Float8Holder in1 = constant6;
                Float8Holder in2 = out10;
                 
SubtractFunctions$Float8Float8Subtract_eval: {
    out.value = (double) (in1.value - in2.value);
}
 
                out11 = out;
            }
            //---- end of eval portion of subtract function. ----//
            //---- start of eval portion of multiply function. ----//
            Float8Holder out12 = new Float8Holder();
            {
                final Float8Holder out = new Float8Holder();
                Float8Holder in1 = out3;
                Float8Holder in2 = out11;
                 
MultiplyFunctions$Float8Float8Multiply_eval: {
    out.value = (double) (in1.value * in2.value);
}
 
                out12 = out;
            }
            //---- end of eval portion of multiply function. ----//
            vv13 .getMutator().set((outIndex), out12 .value);
        }
    }

    public void doSetup(FragmentContext context, RecordBatch incoming, RecordBatch outgoing)
        throws SchemaChangeException
    {
        {
            int[] fieldIds1 = new int[ 1 ] ;
            fieldIds1 [ 0 ] = 7;
            Object tmp2 = (incoming).getValueAccessorById(Float8Vector.class, fieldIds1).getValueVector();
            if (tmp2 == null) {
                throw new SchemaChangeException("Failure while loading vector vv0 with id: TypedFieldId [fieldIds=[7], remainder=null].");
            }
            vv0 = ((Float8Vector) tmp2);
            IntHolder out4 = new IntHolder();
            out4 .value = 1;
            /** start SETUP for function castFLOAT8 **/ 
            {
                IntHolder in = out4;
                 {}
            }
            /** end SETUP for function castFLOAT8 **/ 
            //---- start of eval portion of castFLOAT8 function. ----//
            Float8Holder out5 = new Float8Holder();
            {
                final Float8Holder out = new Float8Holder();
                IntHolder in = out4;
                 
CastIntFloat8_eval: {
    out.value = in.value;
}
 
                out5 = out;
            }
            //---- end of eval portion of castFLOAT8 function. ----//
            constant6 = out5;
            int[] fieldIds8 = new int[ 1 ] ;
            fieldIds8 [ 0 ] = 8;
            Object tmp9 = (incoming).getValueAccessorById(Float8Vector.class, fieldIds8).getValueVector();
            if (tmp9 == null) {
                throw new SchemaChangeException("Failure while loading vector vv7 with id: TypedFieldId [fieldIds=[8], remainder=null].");
            }
            vv7 = ((Float8Vector) tmp9);
            /** start SETUP for function subtract **/ 
            {
                Float8Holder in1 = constant6;
                 {}
            }
            /** end SETUP for function subtract **/ 
            /** start SETUP for function multiply **/ 
            {
                 {}
            }
            /** end SETUP for function multiply **/ 
            int[] fieldIds14 = new int[ 1 ] ;
            fieldIds14 [ 0 ] = 1;
            Object tmp15 = (outgoing).getValueAccessorById(Float8Vector.class, fieldIds14).getValueVector();
            if (tmp15 == null) {
                throw new SchemaChangeException("Failure while loading vector vv13 with id: TypedFieldId [fieldIds=[1], remainder=null].");
            }
            vv13 = ((Float8Vector) tmp15);
        }
    }

    public void __DRILL_INIT__()
        throws SchemaChangeException
    {
    }

}
