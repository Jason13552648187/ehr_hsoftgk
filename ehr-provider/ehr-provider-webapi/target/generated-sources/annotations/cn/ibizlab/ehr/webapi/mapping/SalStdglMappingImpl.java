package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.sal.domain.SalStdgl;
import cn.ibizlab.ehr.webapi.dto.SalStdglDTO;
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
    date = "2021-09-04T00:31:46+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class SalStdglMappingImpl implements SalStdglMapping {

    @Override
    public SalStdgl toDomain(SalStdglDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SalStdgl salStdgl = new SalStdgl();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            salStdgl.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            salStdgl.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getBz() != null ) {
            salStdgl.setBz( dto.getBz() );
        }
        if ( dto.getJsgl() != null ) {
            salStdgl.setJsgl( dto.getJsgl() );
        }
        if ( dto.getSalstdglname() != null ) {
            salStdgl.setSalstdglname( dto.getSalstdglname() );
        }
        if ( dto.getQsgl() != null ) {
            salStdgl.setQsgl( dto.getQsgl() );
        }
        if ( dto.getOrmorgid() != null ) {
            salStdgl.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getUpdateman() != null ) {
            salStdgl.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            salStdgl.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            salStdgl.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getSalstdglid() != null ) {
            salStdgl.setSalstdglid( dto.getSalstdglid() );
        }
        if ( dto.getCreatedate() != null ) {
            salStdgl.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getEnable() != null ) {
            salStdgl.setEnable( dto.getEnable() );
        }
        if ( dto.getOrmorgname() != null ) {
            salStdgl.setOrmorgname( dto.getOrmorgname() );
        }

        return salStdgl;
    }

    @Override
    public SalStdglDTO toDto(SalStdgl entity) {
        if ( entity == null ) {
            return null;
        }

        SalStdglDTO salStdglDTO = new SalStdglDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            salStdglDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            salStdglDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getBz() != null ) {
            salStdglDTO.setBz( entity.getBz() );
        }
        if ( entity.getJsgl() != null ) {
            salStdglDTO.setJsgl( entity.getJsgl() );
        }
        if ( entity.getSalstdglname() != null ) {
            salStdglDTO.setSalstdglname( entity.getSalstdglname() );
        }
        if ( entity.getQsgl() != null ) {
            salStdglDTO.setQsgl( entity.getQsgl() );
        }
        if ( entity.getOrmorgid() != null ) {
            salStdglDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getUpdateman() != null ) {
            salStdglDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            salStdglDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            salStdglDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getSalstdglid() != null ) {
            salStdglDTO.setSalstdglid( entity.getSalstdglid() );
        }
        if ( entity.getCreatedate() != null ) {
            salStdglDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getEnable() != null ) {
            salStdglDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getOrmorgname() != null ) {
            salStdglDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return salStdglDTO;
    }

    @Override
    public List<SalStdgl> toDomain(List<SalStdglDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalStdgl> list = new ArrayList<SalStdgl>( dtoList.size() );
        for ( SalStdglDTO salStdglDTO : dtoList ) {
            list.add( toDomain( salStdglDTO ) );
        }

        return list;
    }

    @Override
    public List<SalStdglDTO> toDto(List<SalStdgl> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalStdglDTO> list = new ArrayList<SalStdglDTO>( entityList.size() );
        for ( SalStdgl salStdgl : entityList ) {
            list.add( toDto( salStdgl ) );
        }

        return list;
    }
}
