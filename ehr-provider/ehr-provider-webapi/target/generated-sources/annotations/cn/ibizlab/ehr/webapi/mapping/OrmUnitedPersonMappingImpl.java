package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmUnitedPerson;
import cn.ibizlab.ehr.webapi.dto.OrmUnitedPersonDTO;
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
    date = "2021-09-04T00:31:50+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class OrmUnitedPersonMappingImpl implements OrmUnitedPersonMapping {

    @Override
    public OrmUnitedPerson toDomain(OrmUnitedPersonDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmUnitedPerson ormUnitedPerson = new OrmUnitedPerson();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormUnitedPerson.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormUnitedPerson.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getUsername() != null ) {
            ormUnitedPerson.setUsername( dto.getUsername() );
        }
        if ( dto.getUnitedpersonname() != null ) {
            ormUnitedPerson.setUnitedpersonname( dto.getUnitedpersonname() );
        }
        if ( dto.getIsemployee() != null ) {
            ormUnitedPerson.setIsemployee( dto.getIsemployee() );
        }
        if ( dto.getRefermark() != null ) {
            ormUnitedPerson.setRefermark( dto.getRefermark() );
        }
        if ( dto.getSex() != null ) {
            ormUnitedPerson.setSex( dto.getSex() );
        }
        if ( dto.getEmployeename() != null ) {
            ormUnitedPerson.setEmployeename( dto.getEmployeename() );
        }
        if ( dto.getFullname() != null ) {
            ormUnitedPerson.setFullname( dto.getFullname() );
        }
        if ( dto.getEmpid() != null ) {
            ormUnitedPerson.setEmpid( dto.getEmpid() );
        }
        if ( dto.getEhrempid() != null ) {
            ormUnitedPerson.setEhrempid( dto.getEhrempid() );
        }
        if ( dto.getIdnumber() != null ) {
            ormUnitedPerson.setIdnumber( dto.getIdnumber() );
        }
        if ( dto.getEmployeenumber() != null ) {
            ormUnitedPerson.setEmployeenumber( dto.getEmployeenumber() );
        }
        if ( dto.getCreateman() != null ) {
            ormUnitedPerson.setCreateman( dto.getCreateman() );
        }
        if ( dto.getEnable() != null ) {
            ormUnitedPerson.setEnable( dto.getEnable() );
        }
        if ( dto.getUnitedpersonid() != null ) {
            ormUnitedPerson.setUnitedpersonid( dto.getUnitedpersonid() );
        }
        if ( dto.getUpdateman() != null ) {
            ormUnitedPerson.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormUnitedPerson.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            ormUnitedPerson.setCreatedate( dto.getCreatedate() );
        }

        return ormUnitedPerson;
    }

    @Override
    public OrmUnitedPersonDTO toDto(OrmUnitedPerson entity) {
        if ( entity == null ) {
            return null;
        }

        OrmUnitedPersonDTO ormUnitedPersonDTO = new OrmUnitedPersonDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormUnitedPersonDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormUnitedPersonDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getUsername() != null ) {
            ormUnitedPersonDTO.setUsername( entity.getUsername() );
        }
        if ( entity.getUnitedpersonname() != null ) {
            ormUnitedPersonDTO.setUnitedpersonname( entity.getUnitedpersonname() );
        }
        if ( entity.getIsemployee() != null ) {
            ormUnitedPersonDTO.setIsemployee( entity.getIsemployee() );
        }
        if ( entity.getRefermark() != null ) {
            ormUnitedPersonDTO.setRefermark( entity.getRefermark() );
        }
        if ( entity.getSex() != null ) {
            ormUnitedPersonDTO.setSex( entity.getSex() );
        }
        if ( entity.getEmployeename() != null ) {
            ormUnitedPersonDTO.setEmployeename( entity.getEmployeename() );
        }
        if ( entity.getFullname() != null ) {
            ormUnitedPersonDTO.setFullname( entity.getFullname() );
        }
        if ( entity.getEmpid() != null ) {
            ormUnitedPersonDTO.setEmpid( entity.getEmpid() );
        }
        if ( entity.getEhrempid() != null ) {
            ormUnitedPersonDTO.setEhrempid( entity.getEhrempid() );
        }
        if ( entity.getIdnumber() != null ) {
            ormUnitedPersonDTO.setIdnumber( entity.getIdnumber() );
        }
        if ( entity.getEmployeenumber() != null ) {
            ormUnitedPersonDTO.setEmployeenumber( entity.getEmployeenumber() );
        }
        if ( entity.getCreateman() != null ) {
            ormUnitedPersonDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getEnable() != null ) {
            ormUnitedPersonDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUnitedpersonid() != null ) {
            ormUnitedPersonDTO.setUnitedpersonid( entity.getUnitedpersonid() );
        }
        if ( entity.getUpdateman() != null ) {
            ormUnitedPersonDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormUnitedPersonDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            ormUnitedPersonDTO.setCreatedate( entity.getCreatedate() );
        }

        return ormUnitedPersonDTO;
    }

    @Override
    public List<OrmUnitedPerson> toDomain(List<OrmUnitedPersonDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmUnitedPerson> list = new ArrayList<OrmUnitedPerson>( dtoList.size() );
        for ( OrmUnitedPersonDTO ormUnitedPersonDTO : dtoList ) {
            list.add( toDomain( ormUnitedPersonDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmUnitedPersonDTO> toDto(List<OrmUnitedPerson> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmUnitedPersonDTO> list = new ArrayList<OrmUnitedPersonDTO>( entityList.size() );
        for ( OrmUnitedPerson ormUnitedPerson : entityList ) {
            list.add( toDto( ormUnitedPerson ) );
        }

        return list;
    }
}
