package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.vac.domain.VacSynjcx;
import cn.ibizlab.ehr.webapi.dto.VacSynjcxDTO;
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
    date = "2021-09-04T00:31:44+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class VacSynjcxMappingImpl implements VacSynjcxMapping {

    @Override
    public VacSynjcx toDomain(VacSynjcxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        VacSynjcx vacSynjcx = new VacSynjcx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            vacSynjcx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            vacSynjcx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getBz() != null ) {
            vacSynjcx.setBz( dto.getBz() );
        }
        if ( dto.getYynj() != null ) {
            vacSynjcx.setYynj( dto.getYynj() );
        }
        if ( dto.getSynjts() != null ) {
            vacSynjcx.setSynjts( dto.getSynjts() );
        }
        if ( dto.getBnts() != null ) {
            vacSynjcx.setBnts( dto.getBnts() );
        }
        if ( dto.getKsyxsj() != null ) {
            vacSynjcx.setKsyxsj( dto.getKsyxsj() );
        }
        if ( dto.getVacsynjcxname() != null ) {
            vacSynjcx.setVacsynjcxname( dto.getVacsynjcxname() );
        }
        if ( dto.getSjbnts() != null ) {
            vacSynjcx.setSjbnts( dto.getSjbnts() );
        }
        if ( dto.getNd() != null ) {
            vacSynjcx.setNd( dto.getNd() );
        }
        if ( dto.getJsyxsj() != null ) {
            vacSynjcx.setJsyxsj( dto.getJsyxsj() );
        }
        if ( dto.getBcts() != null ) {
            vacSynjcx.setBcts( dto.getBcts() );
        }
        if ( dto.getPimpersonid() != null ) {
            vacSynjcx.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getVacsynjcxid() != null ) {
            vacSynjcx.setVacsynjcxid( dto.getVacsynjcxid() );
        }
        if ( dto.getCreatedate() != null ) {
            vacSynjcx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            vacSynjcx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            vacSynjcx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrgid() != null ) {
            vacSynjcx.setOrgid( dto.getOrgid() );
        }
        if ( dto.getUpdateman() != null ) {
            vacSynjcx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getZz() != null ) {
            vacSynjcx.setZz( dto.getZz() );
        }
        if ( dto.getBm() != null ) {
            vacSynjcx.setBm( dto.getBm() );
        }
        if ( dto.getPimpersonname() != null ) {
            vacSynjcx.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getGly() != null ) {
            vacSynjcx.setGly( dto.getGly() );
        }
        if ( dto.getYgbh() != null ) {
            vacSynjcx.setYgbh( dto.getYgbh() );
        }
        if ( dto.getOrmorgid() != null ) {
            vacSynjcx.setOrmorgid( dto.getOrmorgid() );
        }

        return vacSynjcx;
    }

    @Override
    public VacSynjcxDTO toDto(VacSynjcx entity) {
        if ( entity == null ) {
            return null;
        }

        VacSynjcxDTO vacSynjcxDTO = new VacSynjcxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            vacSynjcxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            vacSynjcxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getBz() != null ) {
            vacSynjcxDTO.setBz( entity.getBz() );
        }
        if ( entity.getYynj() != null ) {
            vacSynjcxDTO.setYynj( entity.getYynj() );
        }
        if ( entity.getSynjts() != null ) {
            vacSynjcxDTO.setSynjts( entity.getSynjts() );
        }
        if ( entity.getBnts() != null ) {
            vacSynjcxDTO.setBnts( entity.getBnts() );
        }
        if ( entity.getKsyxsj() != null ) {
            vacSynjcxDTO.setKsyxsj( entity.getKsyxsj() );
        }
        if ( entity.getVacsynjcxname() != null ) {
            vacSynjcxDTO.setVacsynjcxname( entity.getVacsynjcxname() );
        }
        if ( entity.getSjbnts() != null ) {
            vacSynjcxDTO.setSjbnts( entity.getSjbnts() );
        }
        if ( entity.getNd() != null ) {
            vacSynjcxDTO.setNd( entity.getNd() );
        }
        if ( entity.getJsyxsj() != null ) {
            vacSynjcxDTO.setJsyxsj( entity.getJsyxsj() );
        }
        if ( entity.getBcts() != null ) {
            vacSynjcxDTO.setBcts( entity.getBcts() );
        }
        if ( entity.getPimpersonid() != null ) {
            vacSynjcxDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getVacsynjcxid() != null ) {
            vacSynjcxDTO.setVacsynjcxid( entity.getVacsynjcxid() );
        }
        if ( entity.getCreatedate() != null ) {
            vacSynjcxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            vacSynjcxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            vacSynjcxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrgid() != null ) {
            vacSynjcxDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getUpdateman() != null ) {
            vacSynjcxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getZz() != null ) {
            vacSynjcxDTO.setZz( entity.getZz() );
        }
        if ( entity.getBm() != null ) {
            vacSynjcxDTO.setBm( entity.getBm() );
        }
        if ( entity.getPimpersonname() != null ) {
            vacSynjcxDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getGly() != null ) {
            vacSynjcxDTO.setGly( entity.getGly() );
        }
        if ( entity.getYgbh() != null ) {
            vacSynjcxDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getOrmorgid() != null ) {
            vacSynjcxDTO.setOrmorgid( entity.getOrmorgid() );
        }

        return vacSynjcxDTO;
    }

    @Override
    public List<VacSynjcx> toDomain(List<VacSynjcxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<VacSynjcx> list = new ArrayList<VacSynjcx>( dtoList.size() );
        for ( VacSynjcxDTO vacSynjcxDTO : dtoList ) {
            list.add( toDomain( vacSynjcxDTO ) );
        }

        return list;
    }

    @Override
    public List<VacSynjcxDTO> toDto(List<VacSynjcx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<VacSynjcxDTO> list = new ArrayList<VacSynjcxDTO>( entityList.size() );
        for ( VacSynjcx vacSynjcx : entityList ) {
            list.add( toDto( vacSynjcx ) );
        }

        return list;
    }
}
