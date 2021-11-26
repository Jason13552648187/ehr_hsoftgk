package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.vac.domain.VacLeaveManage;
import cn.ibizlab.ehr.webapi.dto.VacLeaveManageDTO;
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
    date = "2021-09-04T00:31:52+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class VacLeaveManageMappingImpl implements VacLeaveManageMapping {

    @Override
    public VacLeaveManage toDomain(VacLeaveManageDTO dto) {
        if ( dto == null ) {
            return null;
        }

        VacLeaveManage vacLeaveManage = new VacLeaveManage();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            vacLeaveManage.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            vacLeaveManage.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getVacleavemanagename() != null ) {
            vacLeaveManage.setVacleavemanagename( dto.getVacleavemanagename() );
        }
        if ( dto.getQjmx() != null ) {
            vacLeaveManage.setQjmx( dto.getQjmx() );
        }
        if ( dto.getJhkssxw() != null ) {
            vacLeaveManage.setJhkssxw( dto.getJhkssxw() );
        }
        if ( dto.getQjzl() != null ) {
            vacLeaveManage.setQjzl( dto.getQjzl() );
        }
        if ( dto.getWfqqjstate() != null ) {
            vacLeaveManage.setWfqqjstate( dto.getWfqqjstate() );
        }
        if ( dto.getQjsy() != null ) {
            vacLeaveManage.setQjsy( dto.getQjsy() );
        }
        if ( dto.getSjkssj() != null ) {
            vacLeaveManage.setSjkssj( dto.getSjkssj() );
        }
        if ( dto.getWfresult() != null ) {
            vacLeaveManage.setWfresult( dto.getWfresult() );
        }
        if ( dto.getSjjssj() != null ) {
            vacLeaveManage.setSjjssj( dto.getSjjssj() );
        }
        if ( dto.getTempid() != null ) {
            vacLeaveManage.setTempid( dto.getTempid() );
        }
        if ( dto.getNjsy() != null ) {
            vacLeaveManage.setNjsy( dto.getNjsy() );
        }
        if ( dto.getSjkssxw() != null ) {
            vacLeaveManage.setSjkssxw( dto.getSjkssxw() );
        }
        if ( dto.getQjts() != null ) {
            vacLeaveManage.setQjts( dto.getQjts() );
        }
        if ( dto.getQjjssj() != null ) {
            vacLeaveManage.setQjjssj( dto.getQjjssj() );
        }
        if ( dto.getQjkssj() != null ) {
            vacLeaveManage.setQjkssj( dto.getQjkssj() );
        }
        if ( dto.getSjqjts() != null ) {
            vacLeaveManage.setSjqjts( dto.getSjqjts() );
        }
        if ( dto.getBgsy() != null ) {
            vacLeaveManage.setBgsy( dto.getBgsy() );
        }
        if ( dto.getJhjssxw() != null ) {
            vacLeaveManage.setJhjssxw( dto.getJhjssxw() );
        }
        if ( dto.getSjjssxw() != null ) {
            vacLeaveManage.setSjjssxw( dto.getSjjssxw() );
        }
        if ( dto.getPimpersonid() != null ) {
            vacLeaveManage.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getOrgsectorid() != null ) {
            vacLeaveManage.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getUpdateman() != null ) {
            vacLeaveManage.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getVacleavemanageid() != null ) {
            vacLeaveManage.setVacleavemanageid( dto.getVacleavemanageid() );
        }
        if ( dto.getEnable() != null ) {
            vacLeaveManage.setEnable( dto.getEnable() );
        }
        if ( dto.getCreateman() != null ) {
            vacLeaveManage.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrgid() != null ) {
            vacLeaveManage.setOrgid( dto.getOrgid() );
        }
        if ( dto.getUpdatedate() != null ) {
            vacLeaveManage.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            vacLeaveManage.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            vacLeaveManage.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            vacLeaveManage.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }
        if ( dto.getPimpersonname() != null ) {
            vacLeaveManage.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getZzdzs() != null ) {
            vacLeaveManage.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getYgbh() != null ) {
            vacLeaveManage.setYgbh( dto.getYgbh() );
        }
        if ( dto.getOrmorgid() != null ) {
            vacLeaveManage.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getOrmorgname() != null ) {
            vacLeaveManage.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getJlss() != null ) {
            vacLeaveManage.setJlss( dto.getJlss() );
        }

        return vacLeaveManage;
    }

    @Override
    public VacLeaveManageDTO toDto(VacLeaveManage entity) {
        if ( entity == null ) {
            return null;
        }

        VacLeaveManageDTO vacLeaveManageDTO = new VacLeaveManageDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            vacLeaveManageDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            vacLeaveManageDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getVacleavemanagename() != null ) {
            vacLeaveManageDTO.setVacleavemanagename( entity.getVacleavemanagename() );
        }
        if ( entity.getQjmx() != null ) {
            vacLeaveManageDTO.setQjmx( entity.getQjmx() );
        }
        if ( entity.getJhkssxw() != null ) {
            vacLeaveManageDTO.setJhkssxw( entity.getJhkssxw() );
        }
        if ( entity.getQjzl() != null ) {
            vacLeaveManageDTO.setQjzl( entity.getQjzl() );
        }
        if ( entity.getWfqqjstate() != null ) {
            vacLeaveManageDTO.setWfqqjstate( entity.getWfqqjstate() );
        }
        if ( entity.getQjsy() != null ) {
            vacLeaveManageDTO.setQjsy( entity.getQjsy() );
        }
        if ( entity.getSjkssj() != null ) {
            vacLeaveManageDTO.setSjkssj( entity.getSjkssj() );
        }
        if ( entity.getWfresult() != null ) {
            vacLeaveManageDTO.setWfresult( entity.getWfresult() );
        }
        if ( entity.getSjjssj() != null ) {
            vacLeaveManageDTO.setSjjssj( entity.getSjjssj() );
        }
        if ( entity.getTempid() != null ) {
            vacLeaveManageDTO.setTempid( entity.getTempid() );
        }
        if ( entity.getNjsy() != null ) {
            vacLeaveManageDTO.setNjsy( entity.getNjsy() );
        }
        if ( entity.getSjkssxw() != null ) {
            vacLeaveManageDTO.setSjkssxw( entity.getSjkssxw() );
        }
        if ( entity.getQjts() != null ) {
            vacLeaveManageDTO.setQjts( entity.getQjts() );
        }
        if ( entity.getQjjssj() != null ) {
            vacLeaveManageDTO.setQjjssj( entity.getQjjssj() );
        }
        if ( entity.getQjkssj() != null ) {
            vacLeaveManageDTO.setQjkssj( entity.getQjkssj() );
        }
        if ( entity.getSjqjts() != null ) {
            vacLeaveManageDTO.setSjqjts( entity.getSjqjts() );
        }
        if ( entity.getBgsy() != null ) {
            vacLeaveManageDTO.setBgsy( entity.getBgsy() );
        }
        if ( entity.getJhjssxw() != null ) {
            vacLeaveManageDTO.setJhjssxw( entity.getJhjssxw() );
        }
        if ( entity.getSjjssxw() != null ) {
            vacLeaveManageDTO.setSjjssxw( entity.getSjjssxw() );
        }
        if ( entity.getPimpersonid() != null ) {
            vacLeaveManageDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getOrgsectorid() != null ) {
            vacLeaveManageDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getUpdateman() != null ) {
            vacLeaveManageDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getVacleavemanageid() != null ) {
            vacLeaveManageDTO.setVacleavemanageid( entity.getVacleavemanageid() );
        }
        if ( entity.getEnable() != null ) {
            vacLeaveManageDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreateman() != null ) {
            vacLeaveManageDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrgid() != null ) {
            vacLeaveManageDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getUpdatedate() != null ) {
            vacLeaveManageDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            vacLeaveManageDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            vacLeaveManageDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            vacLeaveManageDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }
        if ( entity.getPimpersonname() != null ) {
            vacLeaveManageDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getZzdzs() != null ) {
            vacLeaveManageDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getYgbh() != null ) {
            vacLeaveManageDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getOrmorgid() != null ) {
            vacLeaveManageDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getOrmorgname() != null ) {
            vacLeaveManageDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getJlss() != null ) {
            vacLeaveManageDTO.setJlss( entity.getJlss() );
        }

        return vacLeaveManageDTO;
    }

    @Override
    public List<VacLeaveManage> toDomain(List<VacLeaveManageDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<VacLeaveManage> list = new ArrayList<VacLeaveManage>( dtoList.size() );
        for ( VacLeaveManageDTO vacLeaveManageDTO : dtoList ) {
            list.add( toDomain( vacLeaveManageDTO ) );
        }

        return list;
    }

    @Override
    public List<VacLeaveManageDTO> toDto(List<VacLeaveManage> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<VacLeaveManageDTO> list = new ArrayList<VacLeaveManageDTO>( entityList.size() );
        for ( VacLeaveManage vacLeaveManage : entityList ) {
            list.add( toDto( vacLeaveManage ) );
        }

        return list;
    }
}
