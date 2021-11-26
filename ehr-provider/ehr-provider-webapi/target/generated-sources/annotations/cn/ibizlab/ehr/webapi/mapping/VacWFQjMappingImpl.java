package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.vac.domain.VacWFQj;
import cn.ibizlab.ehr.webapi.dto.VacWFQjDTO;
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
public class VacWFQjMappingImpl implements VacWFQjMapping {

    @Override
    public VacWFQj toDomain(VacWFQjDTO dto) {
        if ( dto == null ) {
            return null;
        }

        VacWFQj vacWFQj = new VacWFQj();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            vacWFQj.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            vacWFQj.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getDeptleader() != null ) {
            vacWFQj.setDeptleader( dto.getDeptleader() );
        }
        if ( dto.getQjstate() != null ) {
            vacWFQj.setQjstate( dto.getQjstate() );
        }
        if ( dto.getWfqjname() != null ) {
            vacWFQj.setWfqjname( dto.getWfqjname() );
        }
        if ( dto.getWfresult() != null ) {
            vacWFQj.setWfresult( dto.getWfresult() );
        }
        if ( dto.getWfqjid() != null ) {
            vacWFQj.setWfqjid( dto.getWfqjid() );
        }
        if ( dto.getUpdatedate() != null ) {
            vacWFQj.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            vacWFQj.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            vacWFQj.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            vacWFQj.setCreatedate( dto.getCreatedate() );
        }

        return vacWFQj;
    }

    @Override
    public VacWFQjDTO toDto(VacWFQj entity) {
        if ( entity == null ) {
            return null;
        }

        VacWFQjDTO vacWFQjDTO = new VacWFQjDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            vacWFQjDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            vacWFQjDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getDeptleader() != null ) {
            vacWFQjDTO.setDeptleader( entity.getDeptleader() );
        }
        if ( entity.getQjstate() != null ) {
            vacWFQjDTO.setQjstate( entity.getQjstate() );
        }
        if ( entity.getWfqjname() != null ) {
            vacWFQjDTO.setWfqjname( entity.getWfqjname() );
        }
        if ( entity.getWfresult() != null ) {
            vacWFQjDTO.setWfresult( entity.getWfresult() );
        }
        if ( entity.getWfqjid() != null ) {
            vacWFQjDTO.setWfqjid( entity.getWfqjid() );
        }
        if ( entity.getUpdatedate() != null ) {
            vacWFQjDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            vacWFQjDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            vacWFQjDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            vacWFQjDTO.setCreatedate( entity.getCreatedate() );
        }

        return vacWFQjDTO;
    }

    @Override
    public List<VacWFQj> toDomain(List<VacWFQjDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<VacWFQj> list = new ArrayList<VacWFQj>( dtoList.size() );
        for ( VacWFQjDTO vacWFQjDTO : dtoList ) {
            list.add( toDomain( vacWFQjDTO ) );
        }

        return list;
    }

    @Override
    public List<VacWFQjDTO> toDto(List<VacWFQj> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<VacWFQjDTO> list = new ArrayList<VacWFQjDTO>( entityList.size() );
        for ( VacWFQj vacWFQj : entityList ) {
            list.add( toDto( vacWFQj ) );
        }

        return list;
    }
}
