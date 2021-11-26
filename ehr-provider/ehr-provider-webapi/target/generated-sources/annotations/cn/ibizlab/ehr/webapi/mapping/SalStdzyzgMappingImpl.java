package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.sal.domain.SalStdzyzg;
import cn.ibizlab.ehr.webapi.dto.SalStdzyzgDTO;
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
    date = "2021-09-04T00:31:51+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class SalStdzyzgMappingImpl implements SalStdzyzgMapping {

    @Override
    public SalStdzyzg toDomain(SalStdzyzgDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SalStdzyzg salStdzyzg = new SalStdzyzg();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            salStdzyzg.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            salStdzyzg.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSalstdzyzgname() != null ) {
            salStdzyzg.setSalstdzyzgname( dto.getSalstdzyzgname() );
        }
        if ( dto.getBz() != null ) {
            salStdzyzg.setBz( dto.getBz() );
        }
        if ( dto.getZyfl() != null ) {
            salStdzyzg.setZyfl( dto.getZyfl() );
        }
        if ( dto.getJbfl() != null ) {
            salStdzyzg.setJbfl( dto.getJbfl() );
        }
        if ( dto.getOrmorgid() != null ) {
            salStdzyzg.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getEnable() != null ) {
            salStdzyzg.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdateman() != null ) {
            salStdzyzg.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            salStdzyzg.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getSalstdzyzgid() != null ) {
            salStdzyzg.setSalstdzyzgid( dto.getSalstdzyzgid() );
        }
        if ( dto.getUpdatedate() != null ) {
            salStdzyzg.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            salStdzyzg.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrmorgname() != null ) {
            salStdzyzg.setOrmorgname( dto.getOrmorgname() );
        }

        return salStdzyzg;
    }

    @Override
    public SalStdzyzgDTO toDto(SalStdzyzg entity) {
        if ( entity == null ) {
            return null;
        }

        SalStdzyzgDTO salStdzyzgDTO = new SalStdzyzgDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            salStdzyzgDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            salStdzyzgDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSalstdzyzgname() != null ) {
            salStdzyzgDTO.setSalstdzyzgname( entity.getSalstdzyzgname() );
        }
        if ( entity.getBz() != null ) {
            salStdzyzgDTO.setBz( entity.getBz() );
        }
        if ( entity.getZyfl() != null ) {
            salStdzyzgDTO.setZyfl( entity.getZyfl() );
        }
        if ( entity.getJbfl() != null ) {
            salStdzyzgDTO.setJbfl( entity.getJbfl() );
        }
        if ( entity.getOrmorgid() != null ) {
            salStdzyzgDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getEnable() != null ) {
            salStdzyzgDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdateman() != null ) {
            salStdzyzgDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            salStdzyzgDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getSalstdzyzgid() != null ) {
            salStdzyzgDTO.setSalstdzyzgid( entity.getSalstdzyzgid() );
        }
        if ( entity.getUpdatedate() != null ) {
            salStdzyzgDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            salStdzyzgDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrmorgname() != null ) {
            salStdzyzgDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return salStdzyzgDTO;
    }

    @Override
    public List<SalStdzyzg> toDomain(List<SalStdzyzgDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalStdzyzg> list = new ArrayList<SalStdzyzg>( dtoList.size() );
        for ( SalStdzyzgDTO salStdzyzgDTO : dtoList ) {
            list.add( toDomain( salStdzyzgDTO ) );
        }

        return list;
    }

    @Override
    public List<SalStdzyzgDTO> toDto(List<SalStdzyzg> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalStdzyzgDTO> list = new ArrayList<SalStdzyzgDTO>( entityList.size() );
        for ( SalStdzyzg salStdzyzg : entityList ) {
            list.add( toDto( salStdzyzg ) );
        }

        return list;
    }
}
