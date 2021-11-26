package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmTeacherTrain;
import cn.ibizlab.ehr.webapi.dto.TrmTeacherTrainDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:53+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmTeacherTrainMappingImpl implements TrmTeacherTrainMapping {

    @Override
    public TrmTeacherTrain toDomain(TrmTeacherTrainDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmTeacherTrain trmTeacherTrain = new TrmTeacherTrain();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmTeacherTrain.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmTeacherTrain.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPj() != null ) {
            trmTeacherTrain.setPj( dto.getPj() );
        }
        if ( dto.getJf() != null ) {
            trmTeacherTrain.setJf( dto.getJf() );
        }
        if ( dto.getTrmteachertrainname() != null ) {
            trmTeacherTrain.setTrmteachertrainname( dto.getTrmteachertrainname() );
        }
        if ( dto.getTrmtrainplantermid() != null ) {
            trmTeacherTrain.setTrmtrainplantermid( dto.getTrmtrainplantermid() );
        }
        if ( dto.getTrmtraincourseid() != null ) {
            trmTeacherTrain.setTrmtraincourseid( dto.getTrmtraincourseid() );
        }
        if ( dto.getTrmtrainteacherid() != null ) {
            trmTeacherTrain.setTrmtrainteacherid( dto.getTrmtrainteacherid() );
        }
        if ( dto.getTrmtrainaddressid() != null ) {
            trmTeacherTrain.setTrmtrainaddressid( dto.getTrmtrainaddressid() );
        }
        if ( dto.getCreateman() != null ) {
            trmTeacherTrain.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            trmTeacherTrain.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getEnable() != null ) {
            trmTeacherTrain.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmTeacherTrain.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            trmTeacherTrain.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getTrmteachertrainid() != null ) {
            trmTeacherTrain.setTrmteachertrainid( dto.getTrmteachertrainid() );
        }
        if ( dto.getTrmtraincoursename() != null ) {
            trmTeacherTrain.setTrmtraincoursename( dto.getTrmtraincoursename() );
        }
        if ( dto.getTrmtrainaddressname() != null ) {
            trmTeacherTrain.setTrmtrainaddressname( dto.getTrmtrainaddressname() );
        }
        if ( dto.getTrmtrainteachername() != null ) {
            trmTeacherTrain.setTrmtrainteachername( dto.getTrmtrainteachername() );
        }
        if ( dto.getTrmtrainplantermname() != null ) {
            trmTeacherTrain.setTrmtrainplantermname( dto.getTrmtrainplantermname() );
        }
        if ( dto.getPxjssj() != null ) {
            trmTeacherTrain.setPxjssj( dto.getPxjssj() );
        }
        if ( dto.getPxsc() != null ) {
            trmTeacherTrain.setPxsc( dto.getPxsc() );
        }
        if ( dto.getPxkssj() != null ) {
            trmTeacherTrain.setPxkssj( dto.getPxkssj() );
        }

        return trmTeacherTrain;
    }

    @Override
    public TrmTeacherTrainDTO toDto(TrmTeacherTrain entity) {
        if ( entity == null ) {
            return null;
        }

        TrmTeacherTrainDTO trmTeacherTrainDTO = new TrmTeacherTrainDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmTeacherTrainDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmTeacherTrainDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPj() != null ) {
            trmTeacherTrainDTO.setPj( entity.getPj() );
        }
        if ( entity.getJf() != null ) {
            trmTeacherTrainDTO.setJf( entity.getJf() );
        }
        if ( entity.getTrmteachertrainname() != null ) {
            trmTeacherTrainDTO.setTrmteachertrainname( entity.getTrmteachertrainname() );
        }
        if ( entity.getTrmtrainplantermid() != null ) {
            trmTeacherTrainDTO.setTrmtrainplantermid( entity.getTrmtrainplantermid() );
        }
        if ( entity.getTrmtraincourseid() != null ) {
            trmTeacherTrainDTO.setTrmtraincourseid( entity.getTrmtraincourseid() );
        }
        if ( entity.getTrmtrainteacherid() != null ) {
            trmTeacherTrainDTO.setTrmtrainteacherid( entity.getTrmtrainteacherid() );
        }
        if ( entity.getTrmtrainaddressid() != null ) {
            trmTeacherTrainDTO.setTrmtrainaddressid( entity.getTrmtrainaddressid() );
        }
        if ( entity.getCreateman() != null ) {
            trmTeacherTrainDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            trmTeacherTrainDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getEnable() != null ) {
            trmTeacherTrainDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmTeacherTrainDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            trmTeacherTrainDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getTrmteachertrainid() != null ) {
            trmTeacherTrainDTO.setTrmteachertrainid( entity.getTrmteachertrainid() );
        }
        if ( entity.getTrmtraincoursename() != null ) {
            trmTeacherTrainDTO.setTrmtraincoursename( entity.getTrmtraincoursename() );
        }
        if ( entity.getTrmtrainaddressname() != null ) {
            trmTeacherTrainDTO.setTrmtrainaddressname( entity.getTrmtrainaddressname() );
        }
        if ( entity.getTrmtrainteachername() != null ) {
            trmTeacherTrainDTO.setTrmtrainteachername( entity.getTrmtrainteachername() );
        }
        if ( entity.getTrmtrainplantermname() != null ) {
            trmTeacherTrainDTO.setTrmtrainplantermname( entity.getTrmtrainplantermname() );
        }
        if ( entity.getPxjssj() != null ) {
            trmTeacherTrainDTO.setPxjssj( entity.getPxjssj() );
        }
        if ( entity.getPxsc() != null ) {
            trmTeacherTrainDTO.setPxsc( entity.getPxsc() );
        }
        if ( entity.getPxkssj() != null ) {
            trmTeacherTrainDTO.setPxkssj( entity.getPxkssj() );
        }

        return trmTeacherTrainDTO;
    }

    @Override
    public List<TrmTeacherTrain> toDomain(List<TrmTeacherTrainDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmTeacherTrain> list = new ArrayList<TrmTeacherTrain>( dtoList.size() );
        for ( TrmTeacherTrainDTO trmTeacherTrainDTO : dtoList ) {
            list.add( toDomain( trmTeacherTrainDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmTeacherTrainDTO> toDto(List<TrmTeacherTrain> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmTeacherTrainDTO> list = new ArrayList<TrmTeacherTrainDTO>( entityList.size() );
        for ( TrmTeacherTrain trmTeacherTrain : entityList ) {
            list.add( toDto( trmTeacherTrain ) );
        }

        return list;
    }
}
